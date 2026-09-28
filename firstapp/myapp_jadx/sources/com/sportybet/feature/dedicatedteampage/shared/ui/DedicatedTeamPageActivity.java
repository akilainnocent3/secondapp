package com.sportybet.feature.dedicatedteampage.shared.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.dedicatedteampage.shared.ui.DedicatedTeamPageActivity;
import defpackage.elf;
import defpackage.op8;
import defpackage.opl;
import defpackage.rlf;
import defpackage.z4i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/shared/ui/DedicatedTeamPageActivity;", "Lpy1;", "Lrlf;", "<init>", "()V", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DedicatedTeamPageActivity extends opl implements rlf {
    public static final /* synthetic */ int c = 0;
    public z4i0 b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        zn8.a(this, new op8(2137723407, new Function2() { // from class: r5d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = DedicatedTeamPageActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final DedicatedTeamPageActivity dedicatedTeamPageActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1178121216, new Function2() { // from class: s5d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = DedicatedTeamPageActivity.c;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final DedicatedTeamPageActivity dedicatedTeamPageActivity2 = dedicatedTeamPageActivity;
                                boolean zA = aVar2.A(dedicatedTeamPageActivity2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new Function2() { // from class: t5d
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            String str = (String) obj5;
                                            String str2 = (String) obj6;
                                            int i3 = DedicatedTeamPageActivity.c;
                                            str.getClass();
                                            str2.getClass();
                                            xyd0.a.a(str, str2, false, null).show(dedicatedTeamPageActivity2.getSupportFragmentManager(), "StatisticsDialogFragment");
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                hna.b(new j730[]{aet.a.a(dedicatedTeamPageActivity2.getWebViewWrapperService()), wdt.a.a((Function2) objY)}, pp8.b(610600768, new Function2() { // from class: u5d
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i3 = DedicatedTeamPageActivity.c;
                                        int i4 = 0;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            DedicatedTeamPageActivity dedicatedTeamPageActivity3 = dedicatedTeamPageActivity2;
                                            Intent intent = dedicatedTeamPageActivity3.getIntent();
                                            String stringExtra = intent != null ? intent.getStringExtra("team_id") : null;
                                            if (stringExtra == null) {
                                                stringExtra = "";
                                            }
                                            Intent intent2 = dedicatedTeamPageActivity3.getIntent();
                                            String stringExtra2 = intent2 != null ? intent2.getStringExtra("team_name") : null;
                                            Intent intent3 = dedicatedTeamPageActivity3.getIntent();
                                            String stringExtra3 = intent3 != null ? intent3.getStringExtra("entrance") : null;
                                            phx phxVarC = mr10.c(new vkx[0], aVar3);
                                            c6d.a.a.getClass();
                                            String strA = c6d.a.a(stringExtra, stringExtra2, stringExtra3);
                                            boolean zA2 = aVar3.A(dedicatedTeamPageActivity3) | aVar3.A(phxVarC);
                                            Object objY2 = aVar3.y();
                                            if (zA2 || objY2 == a.C0041a.a) {
                                                objY2 = new v5d(i4, dedicatedTeamPageActivity3, phxVarC);
                                                aVar3.r(objY2);
                                            }
                                            uix.c(phxVarC, strA, null, null, null, null, null, null, (Function1) objY2, aVar3, 0, 1020);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 48);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            z4i0 z4i0Var = this.b;
            if (z4i0Var != null) {
                z4i0Var.release();
            } else {
                Intrinsics.n("videoPlaybackManager");
                throw null;
            }
        }
    }
}
