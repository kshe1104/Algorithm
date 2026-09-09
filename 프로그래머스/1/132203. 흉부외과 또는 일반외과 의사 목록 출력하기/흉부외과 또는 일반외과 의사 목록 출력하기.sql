# -- 코드를 입력하세요
# SELECT dr_name,
# dr_id,
# mcdp_cd,
# date_format(hire_ymd,"%Y-%m-%d") 
# from Doctor
# where mcdp_cd = 'CS' or mcdp_cd='GS'
# order by hire_YMD desc, dr_name asc;
# -- 내림차순 desc , 오름차순 asc
# select dr_name, dr_id, mcdp_cd, date_format(hire_ymd,"%Y-%m-%d") as hire_ymd
# from doctor
# where mcdp_cd like 'CS' or mcdp_cd = 'GS'
# order by hire_ymd desc, dr_name asc;

select dr_name,dr_id,mcdp_cd,hire_ymd from doctor
where mcdp_cd like 'GS' || mcdp_cd like 'CS'
order by hire_ymd desc, dr_name asc;