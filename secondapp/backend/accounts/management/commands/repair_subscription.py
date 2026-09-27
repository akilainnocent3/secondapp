from django.contrib.auth.models import User
from django.core.management.base import BaseCommand, CommandError
from django.db import transaction
from accounts.models import Subscription

class Command(BaseCommand):
    help = 'Repair a missing subscription conservatively: trial is consumed; admin must set access dates explicitly.'
    def add_arguments(self, parser):
        parser.add_argument('username')
    @transaction.atomic
    def handle(self, username, **options):
        try:
            user = User.objects.select_for_update().get(username=username)
        except User.DoesNotExist:
            raise CommandError('User not found.')
        _, created = Subscription.objects.get_or_create(user=user, defaults={'trial_consumed': True})
        self.stdout.write('Repaired without granting a trial.' if created else 'Subscription already exists; unchanged.')
