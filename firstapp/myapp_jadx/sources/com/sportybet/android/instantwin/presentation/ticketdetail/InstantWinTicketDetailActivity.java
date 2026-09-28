package com.sportybet.android.instantwin.presentation.ticketdetail;

import android.os.Bundle;
import defpackage.aqe0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.etl;
import defpackage.fmo;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r79;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.v8i0;
import defpackage.zn8;
import defpackage.zpe0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/ticketdetail/InstantWinTicketDetailActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InstantWinTicketDetailActivity extends etl implements rlf, bb40 {
    public static final /* synthetic */ int e = 0;
    public final q8i0 b = new q8i0(jq40.a(d.class), new b(), new a(), new c());
    public jlo c;
    public azm d;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return InstantWinTicketDetailActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return InstantWinTicketDetailActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return InstantWinTicketDetailActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zpe0 zpe0Var = zpe0.a;
        elf.a(this, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        zn8.a(this, r79.c);
        getOnBackPressedDispatcher().a(this, new com.sportybet.android.instantwin.presentation.ticketdetail.a(this));
        t340 t340Var = ((d) this.b.getValue()).v;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new fmo(this, t340Var, null, this), 3);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((d) this.b.getValue()).z1(com.sportybet.android.instantwin.presentation.ticketdetail.b.a.C0342a.a);
    }
}
