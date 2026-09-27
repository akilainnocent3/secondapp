from django.contrib.auth.models import User
from django.db.models.signals import post_save
from django.dispatch import receiver
from .models import Subscription
@receiver(post_save, sender=User)
def create_subscription(sender, instance, created, raw=False, **kwargs):
    if created and not raw:
        Subscription.objects.get_or_create(user=instance)
