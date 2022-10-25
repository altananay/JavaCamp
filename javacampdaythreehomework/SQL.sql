Select * from Customers

select ContactName Adi, CompanyName, City from Customers

Select * from Customers where City = 'London'

select * from Products where CategoryID = 1 or CategoryID = 3

select * from Products where CategoryID = 1 and UnitPrice>=10

Select * from Products order by ProductName

Select * from Products order by CategoryID, ProductName

Select * from Products order by UnitPrice

Select * from Products order by UnitPrice asc

Select * from Products order by UnitPrice desc

select * from Products where CategoryID = 1 order by UnitPrice desc

Select count(*) from Products

Select count(*) Adet from Products where CategoryID = 2

Select CategoryID, count(*) Adet from Products group by CategoryID

Select CategoryID, count(*) Adet from Products group by CategoryID having count(*) <10

Select CategoryID, count(*) Adet from Products where UnitPrice>20 group by CategoryID having count(*) <10

select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID

select * from Products, Categories where Products.CategoryID = Categories.CategoryID

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID

select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID

select * from [Order Details]

select * from Products p left join [Order Details] od on p.ProductID = od.ProductID

select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

select * from Products p left join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID