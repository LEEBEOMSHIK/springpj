<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<section class="middlesection">
		<article class="bbs-box">
			<p class="box-title">글쓰기</p>
			<form method="post" action="writeAction.jsp">
				<table>
					<tr class="bbs-mokrok">
						<td colspan="2">글쓰기 양식</td>
					</tr>
					<tr>
						<td colspan="2"><input type="text" name="bbstitle"
							class="bbstitle" maxlength="50" placeholder="글 제목"></td>
					</tr>
					<tr>
						<td class="cooking_genre">요리 장르</td>
						<td><input type="text"></td>
					</tr>
					<tr>
						<td colspan="2"><textarea name="bbscontent" maxlength="2048"
								placeholder="글 내용" class="write-area"></textarea></td>
					</tr>
				</table>
				<div class="write-btn-box">
					<input type="submit" value="글쓰기" class="writebtn">
				</div>
			</form>
		</article>
	</section>
</body>
</html>