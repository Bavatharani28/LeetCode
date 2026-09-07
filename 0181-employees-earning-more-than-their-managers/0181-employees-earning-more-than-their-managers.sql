# Write your MySQL query statement below
select e.name as Employee from employee e left join employee m
on e.managerid=m.id 
where e.salary > m.salary;