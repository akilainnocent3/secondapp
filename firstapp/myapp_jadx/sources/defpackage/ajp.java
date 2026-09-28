package defpackage;

import android.app.Activity;
import com.sportybet.feature.winning.WinningDialogActivity;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ajp implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ajp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                gjp gjpVar = (gjp) obj2;
                AtomicInteger atomicInteger = gjp.r0;
                gjpVar.j0.getClass();
                n8e.a((z7e) obj, gjpVar);
                break;
            default:
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                ((WinningDialogActivity) obj2).M = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
