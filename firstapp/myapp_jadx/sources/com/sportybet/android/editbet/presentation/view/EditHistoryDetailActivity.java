package com.sportybet.android.editbet.presentation.view;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.editbet.presentation.view.EditHistoryDetailActivity;
import defpackage.bm50;
import defpackage.cyb;
import defpackage.g1i;
import defpackage.jq40;
import defpackage.kzh;
import defpackage.lql;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.ozh;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qpf;
import defpackage.r8i0;
import defpackage.rpf;
import defpackage.spf;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/editbet/presentation/view/EditHistoryDetailActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EditHistoryDetailActivity extends lql {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(spf.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return EditHistoryDetailActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return EditHistoryDetailActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return EditHistoryDetailActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_edit_bet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (StringsKt.U(stringExtra)) {
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_original", false);
        zn8.a(this, new op8(506824368, new Function2() { // from class: oof
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = EditHistoryDetailActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final EditHistoryDetailActivity editHistoryDetailActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-1785840327, new Function2() { // from class: pof
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = EditHistoryDetailActivity.c;
                            int i3 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                EditHistoryDetailActivity editHistoryDetailActivity2 = editHistoryDetailActivity;
                                boolean zA = aVar2.A(editHistoryDetailActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new c22(editHistoryDetailActivity2, i3);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                Object objY2 = aVar2.y();
                                if (objY2 == c0042a) {
                                    objY2 = new qof();
                                    aVar2.r(objY2);
                                }
                                ppf.b(null, function0, (Function0) objY2, aVar2, 384);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        spf spfVar = (spf) this.b.getValue();
        kzh.d(new g1i(bm50.a(new qpf(ozh.c(spfVar.b.b(stringExtra), spfVar.a), booleanExtra)), new rpf(spfVar, null)), o8i0.d(spfVar));
    }
}
