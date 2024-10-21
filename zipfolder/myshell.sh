#!/bin/bash
read -p "nhap vao 1 mang so nguyen: " -a arr
sum=0
for i in ${arr[@]}; do
	sum=$(($sum + $i))
done

echo "tong cac phan tu trong mang la : $sum"
