package defpackage;

import com.sporty.android.platform.features.homeshortcut.db.ShortcutDatabase_Impl;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q690 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q690(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new n690((ShortcutDatabase_Impl) obj);
            default:
                int i2 = TxCalendarActivity.f;
                v0h0 v0h0VarZ1 = ((TxCalendarActivity) obj).z1();
                ej5.c(o8i0.d(v0h0VarZ1), null, null, new u0h0(v0h0VarZ1, null), 3);
                return Unit.a;
        }
    }
}
