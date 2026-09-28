package com.sportybet.feature.playtimecontrol;

import android.os.Bundle;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.playtimecontrol.PlayTimeControlActivity;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cr10;
import defpackage.cw;
import defpackage.op8;
import defpackage.phx;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wzl;
import defpackage.xux;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.ytw;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sportybet/feature/playtimecontrol/PlayTimeControlActivity;", "Lpy1;", "Lcw;", "Lxux;", "Lbb40;", "<init>", "()V", "", "title", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayTimeControlActivity extends wzl implements cw, xux, bb40 {
    public static final /* synthetic */ int b = 0;

    @c0d(c = "com.sportybet.feature.playtimecontrol.PlayTimeControlActivity$onCreate$1$1$1$1", f = "PlayTimeControlActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ phx a;
        public final /* synthetic */ PlayTimeControlActivity b;
        public final /* synthetic */ ytw<String> c;

        /* JADX INFO: renamed from: com.sportybet.feature.playtimecontrol.PlayTimeControlActivity$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0414a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[cr10.values().length];
                try {
                    cr10 cr10Var = cr10.SELF_EXCLUSION;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    cr10 cr10Var2 = cr10.SELF_EXCLUSION;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(phx phxVar, PlayTimeControlActivity playTimeControlActivity, ytw<String> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = phxVar;
            this.b = playTimeControlActivity;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final PlayTimeControlActivity playTimeControlActivity = this.b;
            final ytw<String> ytwVar = this.c;
            this.a.a(new yfx.b() { // from class: rl10
                /* JADX WARN: Code duplicated, block: B:10:0x0042  */
                /* JADX WARN: Code duplicated, block: B:15:0x0054  */
                /* JADX WARN: Code duplicated, block: B:17:0x0057  */
                /* JADX WARN: Code duplicated, block: B:20:0x005e  */
                /* JADX WARN: Code duplicated, block: B:21:0x0060  */
                /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:24:0x006c  */
                /* JADX WARN: Code duplicated, block: B:27:0x0070  */
                /* JADX WARN: Code duplicated, block: B:29:0x0074  */
                /* JADX WARN: Code duplicated, block: B:30:0x007e  */
                /* JADX WARN: Code duplicated, block: B:31:0x0088  */
                /* JADX WARN: Code duplicated, block: B:7:0x002d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:8:0x002f  */
                /* JADX WARN: Instruction removed from duplicated block: B:10:0x0042, please report this as an issue */
                @Override // yfx.b
                public final void a(yfx yfxVar, ygx ygxVar, Bundle bundle) {
                    String cMSString;
                    String strI;
                    String string;
                    cr10 cr10VarValueOf;
                    int i;
                    Bundle bundleA;
                    ifx ifxVarH = yfxVar.b.h();
                    String str = ygxVar.b.f;
                    PlayTimeControlActivity playTimeControlActivity2 = playTimeControlActivity;
                    if (str != null) {
                        String strI2 = jq40.a(fn10.class).i();
                        strI2.getClass();
                        if (StringsKt.M(str, strI2, false)) {
                            cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]);
                        } else if (str != null) {
                            strI = jq40.a(dn10.class).i();
                            strI.getClass();
                            if (StringsKt.M(str, strI, false)) {
                                if (ifxVarH != null || (bundleA = ifxVarH.v.a()) == null) {
                                    string = null;
                                } else {
                                    string = bundleA.getString("type");
                                }
                                cr10VarValueOf = string != null ? cr10.valueOf(string) : null;
                                if (cr10VarValueOf == null) {
                                    i = -1;
                                } else {
                                    i = PlayTimeControlActivity.a.C0414a.a[cr10VarValueOf.ordinal()];
                                }
                                if (i == -1) {
                                    cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__time_out, new Object[0]);
                                } else if (i != 1) {
                                    if (i != 2) {
                                        uhc.a();
                                        return;
                                    }
                                    cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__time_out, new Object[0]);
                                } else {
                                    cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__self_exclusion, new Object[0]);
                                }
                            } else {
                                cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]);
                            }
                        } else {
                            cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]);
                        }
                    } else if (str != null) {
                        strI = jq40.a(dn10.class).i();
                        strI.getClass();
                        if (StringsKt.M(str, strI, false)) {
                            if (ifxVarH != null) {
                                string = null;
                            } else {
                                string = null;
                            }
                            if (string != null) {
                            }
                            if (cr10VarValueOf == null) {
                                i = -1;
                            } else {
                                i = PlayTimeControlActivity.a.C0414a.a[cr10VarValueOf.ordinal()];
                            }
                            if (i == -1) {
                                cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__time_out, new Object[0]);
                            } else if (i != 1) {
                                if (i != 2) {
                                    uhc.a();
                                    return;
                                }
                                cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__time_out, new Object[0]);
                            } else {
                                cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__self_exclusion, new Object[0]);
                            }
                        } else {
                            cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]);
                        }
                    } else {
                        cMSString = playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]);
                    }
                    int i2 = PlayTimeControlActivity.b;
                    ytwVar.setValue(cMSString);
                }
            });
            return Unit.a;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-1404588607, new Function2() { // from class: ll10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = PlayTimeControlActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PlayTimeControlActivity playTimeControlActivity = this.a;
                    or0.a(null, false, false, null, pp8.b(-1158637558, new Function2() { // from class: ml10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = PlayTimeControlActivity.b;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final phx phxVarC = mr10.c(new vkx[0], aVar2);
                                Object objY = aVar2.y();
                                final PlayTimeControlActivity playTimeControlActivity2 = playTimeControlActivity;
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    objY = m.b(playTimeControlActivity2.getCMSString(R.string.playtime_control__title, new Object[0]));
                                    aVar2.r(objY);
                                }
                                final ytw ytwVar = (ytw) objY;
                                boolean zA = aVar2.A(phxVarC) | aVar2.A(playTimeControlActivity2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == c0042a) {
                                    objY2 = new PlayTimeControlActivity.a(phxVarC, playTimeControlActivity2, ytwVar, null);
                                    aVar2.r(objY2);
                                }
                                xvf.e(aVar2, phxVarC, (Function2) objY2);
                                hy60.a(null, pp8.b(-501774138, new Function2() { // from class: nl10
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i3 = PlayTimeControlActivity.b;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            String str = (String) ytwVar.getValue();
                                            final phx phxVar = phxVarC;
                                            boolean zA2 = aVar3.A(phxVar);
                                            final PlayTimeControlActivity playTimeControlActivity3 = playTimeControlActivity2;
                                            boolean zA3 = zA2 | aVar3.A(playTimeControlActivity3);
                                            Object objY3 = aVar3.y();
                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                            if (zA3 || objY3 == c0042a2) {
                                                objY3 = new Function0() { // from class: pl10
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i4 = PlayTimeControlActivity.b;
                                                        wix.c(phxVar, playTimeControlActivity3);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY3);
                                            }
                                            Function0 function0 = (Function0) objY3;
                                            Object objY4 = aVar3.y();
                                            if (objY4 == c0042a2) {
                                                objY4 = new ql10();
                                                aVar3.r(objY4);
                                            }
                                            odd0.c(d.a.b, str, function0, (Function0) objY4, aVar3, 3078, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), null, null, null, 0, c68.a(R.color.background_type1_secondary, aVar2), 0L, null, pp8.b(1798675227, new gaj() { // from class: ol10
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        tmz tmzVar = (tmz) obj5;
                                        a aVar3 = (a) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        int i3 = PlayTimeControlActivity.b;
                                        tmzVar.getClass();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= aVar3.M(tmzVar) ? 4 : 2;
                                        }
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                            un10.a(phxVarC, h.e(d.a.b, tmzVar), aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 805306416, 445);
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
