from django.db import migrations

def seed(apps, schema_editor):
    apps.get_model('accounts', 'SiteSettings').objects.get_or_create(pk=1)

class Migration(migrations.Migration):
    dependencies = [('accounts', '0001_initial'), ('auth', '0012_alter_user_first_name_max_length')]
    operations = [
        migrations.RunSQL('CREATE UNIQUE INDEX arena_username_ci ON auth_user (LOWER(username))', 'DROP INDEX arena_username_ci'),
        migrations.RunSQL("CREATE UNIQUE INDEX arena_email_ci ON auth_user (LOWER(email)) WHERE email <> ''", 'DROP INDEX arena_email_ci'),
        migrations.RunPython(seed, migrations.RunPython.noop),
    ]
