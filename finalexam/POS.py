class Product_Class():
    def __init__(self,name):
        self.name = name
        self.product = []
    def __addProduct__(self,num,name,price,per):
        self.product.append(Product(num,name,price,per))

class Product:
    def __init__(self,num,name,price,per):
        self.num = num
        self.name = name
        self.price = int(price)
        self.per = per
    def __PerPrice__(self):
        return self.price * int(self.per.replace("%",""))/100

p = open("d:/python/C109156216/product.txt","r",encoding="utf-8")
s = p.readline()
title = s.split()
s = p.readline()
pc = []
while(s!=''):
    ss = s.split()
    c = True
    
    for i in pc:
        if ss[1]==i.name:
            i.__addProduct__(ss[0],ss[2],ss[3],ss[4])
            c = False
            continue
    if c:
        pc.append(Product_Class(ss[1]))
        pc[len(pc)-1].__addProduct__(ss[0],ss[2],ss[3],ss[4])

    s = p.readline()
p.close()

s = input("輸入你想購買的產品編號或名稱(商品清單輸入list,結束輸入end):")
total = 0
shoppingCart = []
while s !='end':
    if s.count('list'):
        for i in title:
            print(i,end="\t")
        print()
        for i in pc:
            for j in i.product:
                print(j.num,end="\t\t")
                print(i.name,end="\t")
                print(j.name,end="\t")
                print(j.price,end="\t")
                print(j.per,end="\t")
                print()
    else:
        c = True
        for i in pc:
            for j in i.product:
                if s.count(j.name)>0 or s.count(j.num):
                    c = False
                    ss = input("輸入購買數量:")
                    pp = j.__PerPrice__()
                    sss = j.name + "($" + str(j.price) + ")" + " * " + ss + " = " + str(pp * int(ss))
                    if j.per != "100%":
                        sss += "(折扣%s)"%j.per
                    shoppingCart.append(sss)
                    total += pp*int(ss)
        if c:
            print("找不到此商品")
        print("目前的購物清單:")
        for i in shoppingCart:
            print(i)
        print("目前總共:%d元"%(total))
    s = input("輸入你想購買的產品編號或名稱(商品清單輸入list,結帳輸入end):")

print("您的購物清單為:")
for i in shoppingCart:
        print(i)
print("總共:%d元"%(total))
