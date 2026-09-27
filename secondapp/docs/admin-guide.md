# Administrator guide

Use standard `/admin/`; create an administrator with `manage.py createsuperuser`.
Never create or distribute a default administrator password.

* **Create customer:** Users → Add. Set username/password using Django's form.
  Save, then edit email and Subscription inline: full name, international phone.
  A subscription is automatically created with an unstarted trial. No two-part
  name split is required. The customer's first successful API login starts seven days.
* **Access dates:** edit Subscription trial start/end together or paid-until.
  End must follow start. Clearing a consumed trial's dates does not grant a fresh
  trial. All dates are timezone-aware; the admin's default display zone is
  Africa/Dar_es_Salaam. Inspect exact timestamps, not a daily job's result.
* **Suspend:** check suspended and enter a customer-visible reason. The customer
  can sign in to contact support, view receipts or delete their account but cannot
  access new protected content. Uncheck to lift suspension; no new trial starts.
  A deliberately disabled User cannot sign in at all.
* **Record receipt:** Payments → Add. Choose customer subscription, enter the actual
  amount received, uppercase three-letter currency, paid time and unique reference.
  Default months is one. Mark confirmed only when appropriate and save. There is
  no fee, payment gateway or invented verification process. The application locks
  and extends the entitlement exactly once. It does not unsuspend the customer.
* **Calendar months:** January 31 + one month is February 28 (29 in a leap year).
  A following month starts from that resulting expiry. Early payment extends from
  the later existing paid/trial expiry and preserves remaining access.
* **History/corrections:** search Payments by username/reference. Applied periods
  and financial fields become read-only; notes remain editable. No refund system
  is implemented. For a genuine correction, retain the receipt and record an admin
  explanation, then explicitly adjust paid-until. Django's change log records admin
  edits. Do not silently edit an applied amount, duplicate a receipt, or call a
  payment save repeatedly to add months.
* **Contacts:** Site settings contains support email and payment phone. Defaults
  are akilainnocent@pm.me and the exact string 255629645877. Clients display a leading
  + for international dialing and copy the stored value. Changes are fetched on
  app startup/foreground; deployment does not reset them.
* **Password reset:** Users → customer → change password. No email-reset flow is
  advertised. Existing API JWTs and browser sessions stop working after reset.
* **Missing historical subscription:** investigate first. `manage.py
  repair_subscription USERNAME` creates only a missing row with trial consumed and
  no granted access; it never resets existing dates. Restore verified historical
  dates explicitly through admin. Preserve evidence of prior trial use.

Customer deletion permanently removes their subscription and receipts from the live
database. Decide backup retention/legal requirements before operating the service.
