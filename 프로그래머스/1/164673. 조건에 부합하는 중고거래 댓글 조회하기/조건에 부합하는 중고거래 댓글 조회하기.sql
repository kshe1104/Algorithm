# -- 코드를 입력하세요
# SELECT 
# B.Title, 
# B.Board_ID, 
# R.reply_id,
# R.Writer_id,
# R.Contents,
# DATE_FORMAT(R.created_Date,'%Y-%m-%d') as CREATED_DATE
# from used_goods_board B
# JOIN used_goods_reply R
#     on B.board_id = R.board_id
# where B.Created_Date like '2022-10%'
# order by Created_DATE asc , title asc;


select b.title, b.board_id, r.reply_id, r.writer_id, r.contents,r.created_date from used_goods_board b join used_goods_reply r
on b.board_id = r.board_id
where b.created_date like '2022-10%'
order by r.created_date asc, b.title asc;




