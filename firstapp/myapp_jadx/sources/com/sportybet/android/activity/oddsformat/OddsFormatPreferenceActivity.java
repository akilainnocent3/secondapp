package com.sportybet.android.activity.oddsformat;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.activity.oddsformat.OddsFormatPreferenceActivity;
import defpackage.bb40;
import defpackage.cky;
import defpackage.cyb;
import defpackage.jq40;
import defpackage.myl;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/activity/oddsformat/OddsFormatPreferenceActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OddsFormatPreferenceActivity extends myl implements bb40 {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(cky.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return OddsFormatPreferenceActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return OddsFormatPreferenceActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return OddsFormatPreferenceActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(1899367858, new Function2() { // from class: pjy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = OddsFormatPreferenceActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final OddsFormatPreferenceActivity oddsFormatPreferenceActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-393296837, new Function2() { // from class: qjy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = OddsFormatPreferenceActivity.c;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                OddsFormatPreferenceActivity oddsFormatPreferenceActivity2 = oddsFormatPreferenceActivity;
                                cky ckyVar = (cky) oddsFormatPreferenceActivity2.b.getValue();
                                boolean zA = aVar2.A(oddsFormatPreferenceActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new r07(oddsFormatPreferenceActivity2, 3);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                Object objY2 = aVar2.y();
                                if (objY2 == c0042a) {
                                    objY2 = new rjy();
                                    aVar2.r(objY2);
                                }
                                vjy.a(null, ckyVar, function0, (Function0) objY2, aVar2, 3136);
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
    }
}
