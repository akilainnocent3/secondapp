package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.b;
import defpackage.gc6;
import defpackage.ngd;
import defpackage.qlr;
import defpackage.ryi;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends qlr implements Function0<Unit> {
    public final /* synthetic */ b.g a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, b.g gVar, Object obj) {
        super(0);
        this.a = gVar;
        this.b = obj;
        this.c = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final b.g gVar = this.a;
        ArrayList arrayList = gVar.c;
        ryi ryiVar = gVar.f;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((b.h) obj).a.g) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "Completing animating immediately");
                    }
                    gc6 gc6Var = new gc6();
                    ryiVar.u(((b.h) arrayList.get(0)).a.c, this.b, gc6Var, new Runnable() { // from class: ogd
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (FragmentManager.R(2)) {
                                Log.v("FragmentManager", "Transition for all operations has completed");
                            }
                            b.g gVar2 = gVar;
                            ArrayList arrayList2 = gVar2.c;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                ((b.h) obj2).a.c(gVar2);
                            }
                        }
                    });
                    gc6Var.a();
                }
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Animating to start");
            }
            Object obj2 = gVar.q;
            obj2.getClass();
            ryiVar.d(obj2, new ngd(gVar, this.c));
        } else {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Animating to start");
            }
            Object obj3 = gVar.q;
            obj3.getClass();
            ryiVar.d(obj3, new ngd(gVar, this.c));
        }
        return Unit.a;
    }
}
