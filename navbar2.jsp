<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Job Portal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>
<body>
    <%@taglib prefix="c2" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false"%>
    <nav class="navbar navbar-expand-lg navbar-dark bg-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Online Job Portal</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <c2:if test="${userobj.role eq 'admin'}">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="add_job.jsp">Post Job</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="view_job.jsp"><i class="fa-solid fa-eye"></i>View Job</a>
                        </li> 
                    </c2:if>
                </ul>
                <div class="form-inline my-2 my-lg-0">
                    <c2:if test="${userobj.role eq 'admin'}">
                        <a href="#" class="btn btn-light mr-1"><i class="fa-sharp fa-solid fa-arrow-right-to-bracket"></i>Admin</a>
                        <a href="logout" class="btn btn-light"><i class="fa-solid fa-user"></i>Log Out</a>
                    </c2:if>
                    <c2:if test="${userobj.role eq 'user'}">
                        <a href="#" class="btn btn-light mr-1" data-toggle="modal" data-target="#exampleModal"><i class="fa-sharp fa-solid fa-arrow-right-to-bracket"></i>${userobj.name}</a>
                        <a href="logout" class="btn btn-light"><i class="fa-solid fa-user"></i>Log Out</a>
                    </c2:if>
                    <c2:if test="${ empty userobj}">
                        <a href="login.jsp" class="btn btn-light mr-1"><i class="fa-sharp fa-solid fa-arrow-right-to-bracket"></i>Login</a>
                        <a href="signup.jsp" class="btn btn-light"><i class="fa-solid fa-user"></i>Sign Up</a>
                    </c2:if>
                </div>
            </div>
        </div>
    </nav>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">User Details</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="model-body">
                        <div class="card">
                            <div class="card-body">
                                <div class="text-center text-primary">
                                    <i class="fas fa-user-circle fa-3x"></i>
                                </div>
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <th scope="row">Name</th>
                                            <td>${userobj.name}</td>
                                        </tr>
                                      <!--  <tr>
                                            <th scope="row">Qualification</th>
                                            <td>${userobj.password}</td>
                                        </tr> -->
                                        <tr>
                                            <th scope="row">Email</th>
                                            <td>${userobj.qualification}</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <a href="edit_profile.jsp" class="btn btn-secondary" >Edit</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.10.2/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
 