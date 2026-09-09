-- 코드를 입력하세요
# SELECT Book_ID,DATE_ForMat(Published_DATE,'%Y-%m-%d') from book
# where year(published_date) like 2021 && category = '인문';

# select book_id,date_format(published_date,'%Y-%m-%d')as published_date from book
# where published_date like '2021%' && category like '인문'


select book_id,published_date from book
where category like '인문' && year(published_date) like 2021;