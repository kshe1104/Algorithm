# -- 코드를 입력하세요
# SELECT ROUND(AVG(DAILY_FEE)) as AVERAGE_FEE
# FROM CAR_RENTAL_COMPANY_CAR
# WHERE CAR_TYPE ='SUV'

# select round(avg(daily_Fee)) as average_fee from car_rental_Company_car
# where car_type like 'suv';

select round(avg(Daily_fee)) as AVERAGE_FEE from car_rental_company_car where car_type like 'SUV';