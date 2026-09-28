package com.sportybet.android.instantwin.presentation.scheduledfootball;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.instantwin.router.scheduledfootball.ScheduledFootballInput;
import defpackage.aqe0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.d2m;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.elf;
import defpackage.fgo;
import defpackage.fqk;
import defpackage.hn9;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.mgb0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.wz60;
import defpackage.xz60;
import defpackage.zn8;
import defpackage.zpe0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/scheduledfootball/ScheduledFootballActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScheduledFootballActivity extends d2m implements rlf, bb40 {
    public static final /* synthetic */ int v = 0;
    public final q8i0 b = new q8i0(jq40.a(com.sportybet.android.instantwin.presentation.scheduledfootball.d.class), new c(), new b(), new d());
    public mgb0 c;
    public fgo d;
    public jlo e;
    public azm f;
    public ee<fqk> i;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static Intent a(Context context, ScheduledFootballInput scheduledFootballInput) {
            Intent intent = new Intent(context, (Class<?>) ScheduledFootballActivity.class);
            intent.setFlags(603979776);
            intent.putExtra("ARG_INPUT", scheduledFootballInput);
            return intent;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ScheduledFootballActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ScheduledFootballActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ScheduledFootballActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zpe0 zpe0Var = zpe0.a;
        elf.a(this, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        zn8.a(this, hn9.c);
        jlo jloVar = this.e;
        if (jloVar == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        this.i = registerForActivityResult(jloVar.a(), new wz60(this));
        ku90<com.sportybet.android.instantwin.presentation.scheduledfootball.c> ku90Var = z1().V;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new xz60(this, ku90Var, null, this), 3);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        Object value;
        wwd0 wwd0Var = z1().O;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        Object value;
        super.onResume();
        wwd0 wwd0Var = z1().O;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
        z1().z1(com.sportybet.android.instantwin.presentation.scheduledfootball.b.InterfaceC0322b.d.a);
    }

    public final com.sportybet.android.instantwin.presentation.scheduledfootball.d z1() {
        return (com.sportybet.android.instantwin.presentation.scheduledfootball.d) this.b.getValue();
    }
}
