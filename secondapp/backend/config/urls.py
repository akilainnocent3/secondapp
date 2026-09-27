from django.contrib import admin
from django.urls import path
from accounts import views
urlpatterns = [path('admin/', admin.site.urls), path('health/', views.health)]
for route, view in [('settings', views.PublicSettings), ('auth/csrf', views.Csrf), ('auth/register', views.Register), ('auth/login', views.Login), ('auth/web/login', views.WebLogin), ('auth/refresh', views.Refresh), ('auth/logout', views.Logout), ('me', views.Me), ('access', views.Access), ('payments', views.Payments), ('content', views.Content)]:
    urlpatterns.append(path('api/v1/' + route + '/', view.as_view()))

handler500 = 'accounts.views.server_error'
