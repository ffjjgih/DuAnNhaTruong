<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="./assets/home.css">
    <link rel="stylesheet" href="./assets/base.css">
    <link rel="stylesheet" href="./assets/grid.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
        integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="./assets/fontawesome-free-5.15.3-web/css/all.min.css">
</head>

<body>
    <div class="Container">
        <div class="row">
            <div class="col-2 container_left">
                <div class="container_left-header">
                    <img src="./assets/image/Poly.png" alt="">
                </div>
                <div class="container_left-body">
                    <button class="container_left-body-btn">DashBoard</button>
                </div>
            </div>
            <div class="col-10 container_right">
                <div class="container_right-header">
                    <div class="container_right-header-TT">
                        <img class="header_right-icon_user" src="./assets/image/user.png" alt="">
                        <h4 class="header_right-name_user">Nguyễn Lê Hải</h4>
                        <button class="header_right-btn_user">Đăng xuất</button>
                    </div>
                </div>
                <div class="container container_right-body">
                    <div class="container_right-body-intro">
                        <h2>Danh sách ca thi</h2>
                    </div>
                    <div class="container container_right-body-controller">
                        <div class="container_right-body-controller-header">
                            <div class="container_right-body-controller-header-left">
                                <a href=""><i class="fas fa-plus plus"></i>Thêm mới</a>
                            </div>
                            <div class="container_right-body-controller-header-right">
                                <select class="form-select form-select-lg mb-3 cbb"
                                    aria-label=".form-select-lg example">
                                    <option value="20">20</option>
                                    <option value="40">40</option>
                                    <option value="60">60</option>
                                </select>
                            </div>
                        </div>
                        <div class="container_right-body-controller-table">
                            <table class="table table-striped">
                                <thead class="thead-dark">
                                    <tr>
                                        <th scope="col">TT</th>
                                        <th scope="col">Học kỳ</th>
                                        <th scope="col">Block</th>
                                        <th scope="col">Trạng thái</th>
                                        <th scope="col">Thao tác</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td><a href="">Fall 2021</a></td>
                                        <td>1</td>
                                        <td>Đang hoạt động</td>
                                        <td>
                                            <button class="button_update">Cập nhật</button>
                                            <button class="button_edit">Chỉnh sửa</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td><a href="">Summer 2021</a></td>
                                        <td>2</td>
                                        <td>Đã kết thúc</td>
                                        <td>
                                            <button class="button_update">Cập nhật</button>
                                            <button class="button_edit">Chỉnh sửa</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td><a href="">Summer 2021</a></td>
                                        <td>1</td>
                                        <td>Đã kết thúc</td>
                                        <td>
                                            <button class="button_update">Cập nhật</button>
                                            <button class="button_edit">Chỉnh sửa</button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="container container_right-body-footer">
                            <nav aria-label="Page navigation example">
                                <ul class="pagination pagination-lg">
                                    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</body>

</html>