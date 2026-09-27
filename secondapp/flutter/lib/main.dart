import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:intl/intl.dart';
import 'package:url_launcher/url_launcher.dart';

import 'access_controller.dart';
import 'api.dart';

void main() {
  WidgetsFlutterBinding.ensureInitialized();
  final controller = AccessController(ArenaApi());
  runApp(SoccerArena(controller: controller));
  unawaited(controller.start());
}

const emerald = Color(0xff4cdeb0);
const navy = Color(0xff0c141d);
const panel = Color(0xff15222f);

class SoccerArena extends StatelessWidget {
  final AccessController controller;
  const SoccerArena({super.key, required this.controller});
  @override
  Widget build(BuildContext context) => MaterialApp(
    title: 'SoccerArena',
    debugShowCheckedModeBanner: false,
    theme: ThemeData(
      useMaterial3: true,
      brightness: Brightness.dark,
      scaffoldBackgroundColor: navy,
      colorScheme: const ColorScheme.dark(
        primary: emerald,
        surface: panel,
        onPrimary: navy,
        onSurface: Color(0xffedf3f7),
        secondary: emerald,
      ),
      textTheme: const TextTheme(
        headlineLarge: TextStyle(
          fontSize: 38,
          fontWeight: FontWeight.w800,
          letterSpacing: -1.3,
        ),
        headlineMedium: TextStyle(
          fontSize: 28,
          fontWeight: FontWeight.w700,
          letterSpacing: -.6,
        ),
        bodyLarge: TextStyle(fontSize: 16, height: 1.5),
        bodyMedium: TextStyle(
          fontSize: 14,
          height: 1.5,
          color: Color(0xffb8c8d7),
        ),
      ),
      inputDecorationTheme: InputDecorationTheme(
        filled: true,
        fillColor: navy,
        contentPadding: const EdgeInsets.all(18),
        border: OutlineInputBorder(borderRadius: BorderRadius.circular(12)),
        enabledBorder: OutlineInputBorder(
          borderRadius: BorderRadius.circular(12),
          borderSide: const BorderSide(color: Color(0xff354454)),
        ),
      ),
      filledButtonTheme: FilledButtonThemeData(
        style: FilledButton.styleFrom(
          minimumSize: const Size(0, 52),
          textStyle: const TextStyle(fontWeight: FontWeight.w700, fontSize: 16),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(12),
          ),
        ),
      ),
      outlinedButtonTheme: OutlinedButtonThemeData(
        style: OutlinedButton.styleFrom(minimumSize: const Size(0, 48)),
      ),
    ),
    home: AnimatedBuilder(
      animation: controller,
      builder: (context, _) => ArenaHome(controller: controller),
    ),
  );
}

class ArenaHome extends StatefulWidget {
  final AccessController controller;
  const ArenaHome({super.key, required this.controller});
  @override
  State<ArenaHome> createState() => _ArenaHomeState();
}

class _ArenaHomeState extends State<ArenaHome> {
  bool signup = false;
  String? notice;
  @override
  Widget build(BuildContext context) {
    final c = widget.controller;
    Widget body;
    if (c.state == AccessState.checking) {
      body = const StatusPanel(
        icon: Icons.shield_outlined,
        title: 'Checking your access',
        message: 'Connecting securely to SoccerArena…',
        loading: true,
      );
    } else if (c.state == AccessState.unavailable) {
      body = StatusPanel(
        icon: Icons.wifi_off_rounded,
        title: 'Unable to verify access',
        message: c.message ?? 'Check your connection and try again.',
        actions: [
          FilledButton.icon(
            onPressed: c.account == null ? c.start : c.verify,
            icon: const Icon(Icons.refresh),
            label: const Text('Retry connection'),
          ),
          if (c.account != null)
            TextButton(onPressed: c.logout, child: const Text('Retry logout')),
          Contacts(controller: c),
        ],
      );
    } else if (c.state == AccessState.signedOut) {
      body = AuthForm(
        controller: c,
        signup: signup,
        notice: notice,
        onSwitch: () => setState(() {
          signup = !signup;
          notice = null;
        }),
        onRegistered: () => setState(() {
          signup = false;
          notice = 'Account created. Sign in to begin your seven-day trial.';
        }),
      );
    } else {
      body = AccountPanel(controller: c);
    }
    return Scaffold(
      body: SafeArea(
        child: LayoutBuilder(
          builder: (context, box) {
            final wide = box.maxWidth >= 1000;
            return SingleChildScrollView(
              child: Center(
                child: ConstrainedBox(
                  constraints: const BoxConstraints(maxWidth: 1240),
                  child: Padding(
                    padding: EdgeInsets.symmetric(
                      horizontal: box.maxWidth < 600 ? 20 : 40,
                      vertical: 28,
                    ),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Row(
                          children: [
                            const Icon(
                              Icons.sports_soccer_rounded,
                              color: emerald,
                              size: 32,
                            ),
                            const SizedBox(width: 10),
                            Expanded(
                              child: Text(
                                'SOCCERARENA',
                                style: Theme.of(context).textTheme.titleMedium
                                    ?.copyWith(
                                      fontWeight: FontWeight.w800,
                                      letterSpacing: 1.8,
                                    ),
                              ),
                            ),
                            if (wide) const Text('YOUR GAME. YOUR ARENA.'),
                          ],
                        ),
                        SizedBox(height: wide ? 64 : 32),
                        if (wide)
                          Row(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              const Expanded(child: _BrandPanel()),
                              const SizedBox(width: 72),
                              Expanded(child: body),
                            ],
                          )
                        else
                          Center(
                            child: ConstrainedBox(
                              constraints: const BoxConstraints(maxWidth: 560),
                              child: body,
                            ),
                          ),
                        const SizedBox(height: 36),
                        const Center(
                          child: Text(
                            'SoccerArena  •  Account & access',
                            textAlign: TextAlign.center,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            );
          },
        ),
      ),
    );
  }
}

class _BrandPanel extends StatelessWidget {
  const _BrandPanel();
  @override
  Widget build(BuildContext context) => Column(
    crossAxisAlignment: CrossAxisAlignment.start,
    children: [
      const Text(
        'WELCOME TO YOUR ARENA',
        style: TextStyle(
          color: emerald,
          letterSpacing: 2,
          fontWeight: FontWeight.w700,
        ),
      ),
      const SizedBox(height: 20),
      Text(
        'The beautiful game.\nOne place to belong.',
        style: Theme.of(context).textTheme.headlineLarge,
      ),
      const SizedBox(height: 20),
      const Text(
        'Manage your access, keep track of your payments, and get support when you need it.',
        style: TextStyle(fontSize: 18, height: 1.6, color: Color(0xffb8c8d7)),
      ),
      const SizedBox(height: 36),
      ExcludeSemantics(
        child: AspectRatio(
          aspectRatio: 1.7,
          child: CustomPaint(painter: PitchPainter()),
        ),
      ),
      const SizedBox(height: 28),
      const Row(
        children: [
          Icon(Icons.verified_user_outlined, color: emerald, size: 20),
          SizedBox(width: 10),
          Expanded(
            child: Text(
              'Seven days to explore. Your trial begins at first sign-in.',
            ),
          ),
        ],
      ),
    ],
  );
}

class PitchPainter extends CustomPainter {
  @override
  void paint(Canvas canvas, Size size) {
    final paint = Paint()
      ..color = const Color(0xff24463f)
      ..style = PaintingStyle.stroke
      ..strokeWidth = 2;
    final r = Rect.fromLTWH(12, 12, size.width - 24, size.height - 24);
    canvas.drawRRect(
      RRect.fromRectAndRadius(r, const Radius.circular(18)),
      Paint()..color = const Color(0xff102b28),
    );
    canvas.drawRRect(
      RRect.fromRectAndRadius(r.deflate(18), const Radius.circular(4)),
      paint,
    );
    canvas.drawLine(
      Offset(size.width / 2, 30),
      Offset(size.width / 2, size.height - 30),
      paint,
    );
    canvas.drawCircle(size.center(Offset.zero), size.height * .18, paint);
    canvas.drawCircle(size.center(Offset.zero), 4, Paint()..color = emerald);
    canvas.drawRect(
      Rect.fromLTWH(30, size.height * .3, 45, size.height * .4),
      paint,
    );
    canvas.drawRect(
      Rect.fromLTWH(size.width - 75, size.height * .3, 45, size.height * .4),
      paint,
    );
  }

  @override
  bool shouldRepaint(covariant CustomPainter oldDelegate) => false;
}

class Surface extends StatelessWidget {
  final Widget child;
  const Surface({super.key, required this.child});
  @override
  Widget build(BuildContext context) => Container(
    width: double.infinity,
    padding: EdgeInsets.all(MediaQuery.sizeOf(context).width < 400 ? 20 : 28),
    decoration: BoxDecoration(
      color: panel,
      borderRadius: BorderRadius.circular(24),
      border: Border.all(color: const Color(0xff2a3946)),
    ),
    child: child,
  );
}

class StatusPanel extends StatelessWidget {
  final IconData icon;
  final String title, message;
  final bool loading;
  final List<Widget> actions;
  const StatusPanel({
    super.key,
    required this.icon,
    required this.title,
    required this.message,
    this.loading = false,
    this.actions = const [],
  });
  @override
  Widget build(BuildContext context) => Surface(
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Icon(icon, size: 40, color: emerald),
        const SizedBox(height: 24),
        Text(title, style: Theme.of(context).textTheme.headlineMedium),
        const SizedBox(height: 12),
        Text(message),
        if (loading)
          const Padding(
            padding: EdgeInsets.only(top: 24),
            child: LinearProgressIndicator(),
          ),
        for (final action in actions)
          Padding(padding: const EdgeInsets.only(top: 20), child: action),
      ],
    ),
  );
}

class Notice extends StatelessWidget {
  final String text;
  final bool error;
  const Notice(this.text, {super.key, this.error = false});
  @override
  Widget build(BuildContext context) => Semantics(
    liveRegion: true,
    child: Container(
      width: double.infinity,
      margin: const EdgeInsets.only(bottom: 20),
      padding: const EdgeInsets.all(14),
      decoration: BoxDecoration(
        color: error ? const Color(0xff3a242d) : const Color(0xff143c32),
        borderRadius: BorderRadius.circular(10),
      ),
      child: Text(
        text,
        style: TextStyle(
          color: error ? const Color(0xffffc5cf) : const Color(0xffb9f9e4),
        ),
      ),
    ),
  );
}

class AuthForm extends StatefulWidget {
  final AccessController controller;
  final bool signup;
  final String? notice;
  final VoidCallback onSwitch, onRegistered;
  const AuthForm({
    super.key,
    required this.controller,
    required this.signup,
    required this.onSwitch,
    required this.onRegistered,
    this.notice,
  });
  @override
  State<AuthForm> createState() => _AuthFormState();
}

class _AuthFormState extends State<AuthForm> {
  final form = GlobalKey<FormState>();
  final fields = {
    for (final key in [
      'username',
      'full_name',
      'email',
      'phone',
      'password',
      'password_confirmation',
    ])
      key: TextEditingController(),
  };
  bool submitting = false;
  bool visible = false;
  String? error;
  Map<String, dynamic> errors = {};
  @override
  void didUpdateWidget(AuthForm oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (oldWidget.signup != widget.signup) {
      error = null;
      errors = {};
      fields['password']!.clear();
      fields['password_confirmation']!.clear();
    }
  }

  @override
  void dispose() {
    for (final controller in fields.values) {
      controller.dispose();
    }
    super.dispose();
  }

  Future<void> submit() async {
    if (submitting || !(form.currentState?.validate() ?? false)) return;
    setState(() {
      submitting = true;
      error = null;
      errors = {};
    });
    try {
      if (widget.signup) {
        await widget.controller.api.request(
          'auth/register/',
          method: 'POST',
          body: {
            for (final entry in fields.entries) entry.key: entry.value.text,
          },
        );
        widget.onRegistered();
      } else {
        await widget.controller.login(
          fields['username']!.text.trim(),
          fields['password']!.text,
        );
      }
    } on ApiFailure catch (e) {
      if (mounted) {
        setState(() {
          error = e.message;
          errors = e.fields;
        });
      }
    } catch (_) {
      if (mounted) {
        setState(
          () => error = 'Unable to complete this request. Please retry.',
        );
      }
    } finally {
      if (mounted) setState(() => submitting = false);
    }
  }

  Widget field(
    String key,
    String label, {
    bool password = false,
    TextInputType? keyboard,
    Iterable<String>? autofill,
  }) => Padding(
    padding: const EdgeInsets.only(bottom: 18),
    child: TextFormField(
      controller: fields[key],
      enabled: !submitting,
      autofillHints: autofill,
      keyboardType: keyboard,
      obscureText: password && !visible,
      autocorrect: !password && key == 'full_name',
      enableSuggestions: !password,
      textInputAction:
          key == (widget.signup ? 'password_confirmation' : 'password')
          ? TextInputAction.done
          : TextInputAction.next,
      onFieldSubmitted: (_) {
        if (key == (widget.signup ? 'password_confirmation' : 'password')) {
          submit();
        }
      },
      decoration: InputDecoration(
        labelText: label,
        helperText: key == 'phone'
            ? 'Include country code, for example +255…'
            : null,
        errorText: errors[key] == null
            ? null
            : (errors[key] is List
                  ? (errors[key] as List).join(' ')
                  : '${errors[key]}'),
        suffixIcon: password
            ? IconButton(
                tooltip: visible ? 'Hide password' : 'Show password',
                onPressed: () => setState(() => visible = !visible),
                icon: Icon(
                  visible
                      ? Icons.visibility_off_outlined
                      : Icons.visibility_outlined,
                ),
              )
            : null,
      ),
      validator: (value) {
        if (value == null || value.trim().isEmpty) {
          return 'Enter ${label.toLowerCase()}.';
        }
        if (key == 'email' &&
            !RegExp(r'^[^\s@]+@[^\s@]+\.[^\s@]+$').hasMatch(value)) {
          return 'Enter a valid email address.';
        }
        if (key == 'phone' && !value.startsWith('+')) {
          return 'Start with + and your country code.';
        }
        if (key == 'password_confirmation' &&
            value != fields['password']!.text) {
          return 'Passwords do not match.';
        }
        if (widget.signup && key == 'password' && value.length < 8) {
          return 'Use at least 8 characters.';
        }
        return null;
      },
    ),
  );
  @override
  Widget build(BuildContext context) => Surface(
    child: AutofillGroup(
      child: Form(
        key: form,
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            Text(
              widget.signup ? 'Join the arena' : 'Welcome back',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
            const SizedBox(height: 10),
            Text(
              widget.signup
                  ? 'Create your account. Your seven-day trial starts on your first successful sign-in.'
                  : 'Sign in to manage your SoccerArena access.',
            ),
            const SizedBox(height: 28),
            if (widget.notice != null) Notice(widget.notice!),
            if (error != null) Notice(error!, error: true),
            field(
              'username',
              'Username',
              autofill: [
                widget.signup
                    ? AutofillHints.newUsername
                    : AutofillHints.username,
              ],
            ),
            if (widget.signup) ...[
              field('full_name', 'Full name', autofill: [AutofillHints.name]),
              field(
                'email',
                'Email address',
                keyboard: TextInputType.emailAddress,
                autofill: [AutofillHints.email],
              ),
              field(
                'phone',
                'International phone number',
                keyboard: TextInputType.phone,
                autofill: [AutofillHints.telephoneNumber],
              ),
            ],
            field(
              'password',
              'Password',
              password: true,
              autofill: [
                widget.signup
                    ? AutofillHints.newPassword
                    : AutofillHints.password,
              ],
            ),
            if (widget.signup)
              field(
                'password_confirmation',
                'Confirm password',
                password: true,
                autofill: [AutofillHints.newPassword],
              ),
            FilledButton(
              onPressed: submitting ? null : submit,
              child: submitting
                  ? const SizedBox(
                      height: 22,
                      width: 22,
                      child: CircularProgressIndicator(strokeWidth: 2),
                    )
                  : Text(widget.signup ? 'Create account' : 'Sign in'),
            ),
            const SizedBox(height: 14),
            TextButton(
              onPressed: submitting ? null : widget.onSwitch,
              child: Text(
                widget.signup
                    ? 'Already a member? Sign in'
                    : 'New here? Create an account',
              ),
            ),
            if (!widget.signup) ...[
              const Divider(height: 32),
              const Text(
                'Need a password reset? Contact support.',
                textAlign: TextAlign.center,
              ),
              const SizedBox(height: 8),
              Contacts(controller: widget.controller, compact: true),
            ],
          ],
        ),
      ),
    ),
  );
}

String dateLabel(dynamic value) {
  if (value == null) return 'Not started';
  final date = DateTime.tryParse('$value')?.toLocal();
  return date == null
      ? 'Unavailable'
      : '${DateFormat('d MMM y, HH:mm').format(date)} ${date.timeZoneName}';
}

class AccountPanel extends StatelessWidget {
  final AccessController controller;
  const AccountPanel({super.key, required this.controller});
  @override
  Widget build(BuildContext context) {
    final c = controller;
    final account = c.account!;
    final state = account['entitlement'] as Map;
    final title = switch (c.state) {
      AccessState.trial => 'Your trial is active',
      AccessState.paid => 'You’re in the arena',
      AccessState.suspended => 'Access suspended',
      _ => 'Time to renew',
    };
    final badge = switch (c.state) {
      AccessState.trial => 'TRIAL',
      AccessState.paid => 'ACTIVE',
      AccessState.suspended => 'SUSPENDED',
      _ => 'EXPIRED',
    };
    return Surface(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          Row(
            children: [
              const Icon(
                Icons.account_circle_outlined,
                size: 30,
                color: emerald,
              ),
              const SizedBox(width: 10),
              Expanded(
                child: Text(
                  'YOUR ACCOUNT',
                  style: Theme.of(context).textTheme.labelLarge,
                ),
              ),
              Chip(
                label: Text(
                  badge,
                  style: const TextStyle(
                    fontSize: 11,
                    fontWeight: FontWeight.bold,
                  ),
                ),
              ),
            ],
          ),
          const SizedBox(height: 20),
          Text(title, style: Theme.of(context).textTheme.headlineMedium),
          const SizedBox(height: 12),
          Text(
            c.allowed
                ? 'Welcome, ${account['full_name'].toString().isEmpty ? account['username'] : account['full_name']}.'
                : c.state == AccessState.suspended
                ? 'Your viewing access is paused. You can still manage your account and contact support.'
                : 'Your viewing access has ended. Your account and payment history are still available.',
          ),
          if (c.state == AccessState.suspended &&
              '${state['reason']}'.isNotEmpty)
            Padding(
              padding: const EdgeInsets.only(top: 12),
              child: Notice('${state['reason']}'),
            ),
          const SizedBox(height: 24),
          Container(
            padding: const EdgeInsets.all(18),
            decoration: BoxDecoration(
              color: navy,
              borderRadius: BorderRadius.circular(12),
            ),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  c.allowed ? 'ACCESS UNTIL' : 'ACCESS EXPIRY',
                  style: const TextStyle(
                    color: emerald,
                    fontSize: 11,
                    letterSpacing: 1.5,
                  ),
                ),
                const SizedBox(height: 8),
                Text(
                  dateLabel(state['expires_at']),
                  style: Theme.of(context).textTheme.titleMedium,
                ),
                if (c.allowed)
                  Padding(
                    padding: const EdgeInsets.only(top: 8),
                    child: Text(
                      '${c.remaining.inHours ~/ 24} days, ${c.remaining.inHours % 24} hours remaining at verification',
                    ),
                  ),
              ],
            ),
          ),
          const SizedBox(height: 20),
          Text('@${account['username']}'),
          Text('${account['email']}'),
          Text('${account['phone'] ?? 'Phone not provided'}'),
          const SizedBox(height: 24),
          if (c.allowed) ...[
            FilledButton.icon(
              onPressed: () async {
                final messenger = ScaffoldMessenger.of(context);
                await c.verify();
                if (!c.allowed) return;
                try {
                  await c.api.request('content/');
                } on ApiFailure catch (e) {
                  if (messenger.mounted) {
                    messenger.showSnackBar(SnackBar(content: Text(e.message)));
                  }
                }
              },
              icon: const Icon(Icons.stadium_outlined),
              label: const Text('Open content'),
            ),
            const SizedBox(height: 12),
            const Text(
              'Content integration is not yet available in this build.',
              textAlign: TextAlign.center,
            ),
          ],
          const Divider(height: 36),
          Contacts(controller: c),
          const SizedBox(height: 20),
          OutlinedButton.icon(
            onPressed: c.verify,
            icon: const Icon(Icons.refresh),
            label: const Text('Check access again'),
          ),
          TextButton.icon(
            onPressed: () => showDialog<void>(
              context: context,
              builder: (_) => PaymentsDialog(controller: c),
            ),
            icon: const Icon(Icons.receipt_long_outlined),
            label: const Text('Payment history'),
          ),
          const Divider(height: 24),
          TextButton(
            onPressed: c.busy ? null : c.logout,
            child: const Text('Sign out on all devices'),
          ),
          TextButton(
            onPressed: () => showDialog<void>(
              context: context,
              barrierDismissible: false,
              builder: (_) => DeleteDialog(controller: c),
            ),
            child: const Text(
              'Delete account',
              style: TextStyle(color: Color(0xffffb8c3)),
            ),
          ),
        ],
      ),
    );
  }
}

class Contacts extends StatelessWidget {
  final AccessController controller;
  final bool compact;
  const Contacts({super.key, required this.controller, this.compact = false});
  Future<void> open(BuildContext context, Uri uri) async {
    try {
      if (await launchUrl(uri)) return;
    } catch (_) {
      /* Show actionable fallback below. */
    }
    if (context.mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
          content: Text(
            'No compatible app was found. Copy the contact details instead.',
          ),
        ),
      );
    }
  }

  Future<void> copy(BuildContext context, String text) async {
    await Clipboard.setData(ClipboardData(text: text));
    if (context.mounted) {
      ScaffoldMessenger.of(context)
          .showSnackBar(const SnackBar(content: Text('Copied to clipboard')));
    }
  }

  @override
  Widget build(BuildContext context) {
    final contacts = controller.contacts;
    final email = '${contacts['support_email']}';
    final raw = '${contacts['payment_phone']}';
    final phone = raw.startsWith('+') ? raw : '+$raw';
    return Column(
      crossAxisAlignment: compact
          ? CrossAxisAlignment.center
          : CrossAxisAlignment.start,
      children: [
        if (!compact) ...[
          Text(
            'Let’s keep you connected',
            style: Theme.of(context).textTheme.titleLarge,
          ),
          const SizedBox(height: 10),
          Text('${contacts['instructions']}'),
          const SizedBox(height: 12),
          SelectableText(
            phone,
            style: Theme.of(context).textTheme.titleLarge
                ?.copyWith(color: emerald),
          ),
          Wrap(
            spacing: 8,
            children: [
              TextButton.icon(
                onPressed: () => copy(context, raw),
                icon: const Icon(Icons.copy, size: 18),
                label: const Text('Copy number'),
              ),
              TextButton.icon(
                onPressed: () => open(context, Uri(scheme: 'tel', path: phone)),
                icon: const Icon(Icons.call_outlined, size: 18),
                label: const Text('Call'),
              ),
            ],
          ),
        ],
        Wrap(
          crossAxisAlignment: WrapCrossAlignment.center,
          children: [
            TextButton(
              onPressed: () =>
                  open(context, Uri(scheme: 'mailto', path: email)),
              child: Text(email),
            ),
            IconButton(
              tooltip: 'Copy support email',
              onPressed: () => copy(context, email),
              icon: const Icon(Icons.copy, size: 18),
            ),
          ],
        ),
      ],
    );
  }
}

class PaymentsDialog extends StatefulWidget {
  final AccessController controller;
  const PaymentsDialog({super.key, required this.controller});
  @override
  State<PaymentsDialog> createState() => _PaymentsDialogState();
}

class _PaymentsDialogState extends State<PaymentsDialog> {
  final List<Map<String, dynamic>> payments = [];
  int page = 1;
  bool more = true, loading = false;
  String? error;
  @override
  void initState() {
    super.initState();
    widget.controller.addListener(_accountChanged);
    load();
  }

  void _accountChanged() {
    if (widget.controller.account == null && mounted) {
      Navigator.of(context).pop();
    }
  }

  @override
  void dispose() {
    widget.controller.removeListener(_accountChanged);
    super.dispose();
  }

  Future<void> load() async {
    if (loading) return;
    setState(() {
      loading = true;
      error = null;
    });
    try {
      final result = await widget.controller.api.request(
        'payments/?page=$page',
      );
      if (mounted) {
        setState(() {
          payments.addAll(
            (result['results'] as List).map(
              (e) => Map<String, dynamic>.from(e),
            ),
          );
          more = result['next'] != null;
          page++;
        });
      }
    } on ApiFailure catch (e) {
      if (mounted) setState(() => error = e.message);
    } finally {
      if (mounted) setState(() => loading = false);
    }
  }

  @override
  Widget build(BuildContext context) => AlertDialog(
    title: const Text('Payment history'),
    content: SizedBox(
      width: 500,
      child: SingleChildScrollView(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            if (error != null) Notice(error!, error: true),
            if (!loading && payments.isEmpty && error == null)
              const Padding(
                padding: EdgeInsets.symmetric(vertical: 28),
                child: Text(
                  'No payments yet. Payments recorded by your administrator will appear here.',
                ),
              ),
            for (final payment in payments)
              Padding(
                padding: const EdgeInsets.only(bottom: 20),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      '${payment['currency']} ${NumberFormat('#,##0.00').format(num.parse('${payment['amount']}'))}',
                      style: Theme.of(context).textTheme.titleLarge,
                    ),
                    Text(
                      payment['applied_at'] != null
                          ? 'Confirmed'
                          : 'Awaiting confirmation',
                      style: const TextStyle(color: emerald),
                    ),
                    Text(dateLabel(payment['paid_at'])),
                    SelectableText('Reference: ${payment['reference']}'),
                    if (payment['period_start'] != null)
                      Text(
                        '${dateLabel(payment['period_start'])}\nto ${dateLabel(payment['period_end'])}',
                      ),
                    const Divider(),
                  ],
                ),
              ),
            if (loading) const Center(child: CircularProgressIndicator()),
            if (!loading && (more || error != null))
              TextButton(
                onPressed: load,
                child: Text(error != null ? 'Retry' : 'Load more'),
              ),
          ],
        ),
      ),
    ),
    actions: [
      TextButton(
        onPressed: () => Navigator.pop(context),
        child: const Text('Close'),
      ),
    ],
  );
}

class DeleteDialog extends StatefulWidget {
  final AccessController controller;
  const DeleteDialog({super.key, required this.controller});
  @override
  State<DeleteDialog> createState() => _DeleteDialogState();
}

class _DeleteDialogState extends State<DeleteDialog> {
  final password = TextEditingController();
  bool busy = false;
  String? error;
  @override
  void dispose() {
    password.dispose();
    super.dispose();
  }

  Future<void> remove() async {
    if (busy) return;
    setState(() {
      busy = true;
      error = null;
    });
    try {
      await widget.controller.deleteAccount(password.text);
      if (mounted) Navigator.pop(context);
    } on ApiFailure catch (e) {
      if (mounted) {
        setState(() => error = e.fields['password']?.toString() ?? e.message);
      }
    } finally {
      if (mounted) setState(() => busy = false);
    }
  }

  @override
  Widget build(BuildContext context) => PopScope(
    canPop: !busy,
    child: AlertDialog(
      title: const Text('Delete your account?'),
      content: SizedBox(
        width: 440,
        child: SingleChildScrollView(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              const Text(
                'This permanently deletes your account, subscription details and payment history. You will be signed out on every device. This cannot be undone.',
              ),
              const SizedBox(height: 20),
              if (error != null) Notice(error!, error: true),
              TextField(
                controller: password,
                enabled: !busy,
                obscureText: true,
                autofillHints: const [AutofillHints.password],
                decoration: const InputDecoration(
                  labelText: 'Current password',
                ),
                onSubmitted: (_) => remove(),
              ),
            ],
          ),
        ),
      ),
      actions: [
        TextButton(
          onPressed: busy ? null : () => Navigator.pop(context),
          child: const Text('Keep account'),
        ),
        FilledButton(
          onPressed: busy ? null : remove,
          child: Text(busy ? 'Deleting…' : 'Delete permanently'),
        ),
      ],
    ),
  );
}
