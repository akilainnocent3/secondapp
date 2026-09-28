package com.sportybet.plugin.sportypicks.ui;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;
import defpackage.azm;
import defpackage.elf;
import defpackage.k4m;
import defpackage.op8;
import defpackage.r0b;
import defpackage.rlf;
import defpackage.wym;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/plugin/sportypicks/ui/SportyPicksActivity;", "Lpy1;", "Lwym;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyPicksActivity extends k4m implements wym, rlf {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        zn8.a(this, new op8(922985037, new Function2() { // from class: l6d0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = SportyPicksActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final SportyPicksActivity sportyPicksActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1136349054, new Function2() { // from class: m6d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = SportyPicksActivity.c;
                            int i3 = 0;
                            int i4 = 1;
                            int i5 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                SportyPicksActivity sportyPicksActivity2 = sportyPicksActivity;
                                boolean zA = aVar2.A(sportyPicksActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new t410(sportyPicksActivity2, i4);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(sportyPicksActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new zs4(sportyPicksActivity2, i5);
                                    aVar2.r(objY2);
                                }
                                Function1 function1 = (Function1) objY2;
                                boolean zA3 = aVar2.A(sportyPicksActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new thi(sportyPicksActivity2, i5);
                                    aVar2.r(objY3);
                                }
                                Function0 function2 = (Function0) objY3;
                                boolean zA4 = aVar2.A(sportyPicksActivity2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new n6d0(sportyPicksActivity2, i3);
                                    aVar2.r(objY4);
                                }
                                b7d0.d(function0, function1, function2, (Function0) objY4, null, aVar2, 0);
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

    @Override // defpackage.wym
    public final boolean y() {
        Application application = getApplication();
        application.getClass();
        return r0b.b(application).equals("dark");
    }
}
