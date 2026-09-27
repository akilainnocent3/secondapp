import phonenumbers
from django.core.exceptions import ValidationError

def normalize_phone(value):
    try:
        if not value.strip().startswith('+'):
            raise ValueError()
        phone = phonenumbers.parse(value, None)
        if not phonenumbers.is_valid_number(phone):
            raise ValueError()
        return phonenumbers.format_number(phone, phonenumbers.PhoneNumberFormat.E164)
    except (ValueError, phonenumbers.NumberParseException):
        raise ValidationError('Enter a valid international phone number starting with +.')
