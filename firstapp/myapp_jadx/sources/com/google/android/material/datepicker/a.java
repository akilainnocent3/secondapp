package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.datepicker.a;
import com.google.android.material.textfield.TextInputLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.hsc;
import defpackage.isc;
import defpackage.rqh0;
import defpackage.tmf0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends tmf0 {
    public final TextInputLayout a;
    public final String b;
    public final SimpleDateFormat c;
    public final CalendarConstraints d;
    public final String e;
    public final hsc f;
    public isc i;
    public int v = 0;

    /* JADX WARN: Type inference failed for: r3v3, types: [hsc] */
    public a(final String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.b = str;
        this.c = simpleDateFormat;
        this.a = textInputLayout;
        this.d = calendarConstraints;
        this.e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f = new Runnable() { // from class: hsc
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.a;
                TextInputLayout textInputLayout2 = aVar.a;
                SimpleDateFormat simpleDateFormat2 = aVar.c;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat2.format(new Date(rqh0.f().getTimeInMillis())).replace(' ', (char) 160)));
                aVar.a();
            }
        };
    }

    public abstract void a();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.b;
        if (length >= str.length() || editable.length() < this.v) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b(Long l);

    @Override // defpackage.tmf0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.v = charSequence.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [isc, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tmf0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.d;
        TextInputLayout textInputLayout = this.a;
        hsc hscVar = this.f;
        textInputLayout.removeCallbacks(hscVar);
        textInputLayout.removeCallbacks(this.i);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date date = this.c.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.c.f0(time)) {
                Calendar calendarC = rqh0.c(calendarConstraints.a.a);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.b;
                    int i4 = month.e;
                    Calendar calendarC2 = rqh0.c(month.a);
                    calendarC2.set(5, i4);
                    if (time <= calendarC2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r7 = new Runnable() { // from class: isc
                @Override // java.lang.Runnable
                public final void run() {
                    String strB = syc.b(time);
                    a aVar = this.a;
                    aVar.a.setError(String.format(aVar.e, strB.replace(' ', (char) 160)));
                    aVar.a();
                }
            };
            this.i = r7;
            textInputLayout.post(r7);
        } catch (ParseException unused) {
            textInputLayout.post(hscVar);
        }
    }
}
