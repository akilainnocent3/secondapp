package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadBitmaps$2", f = "SportyKickViewModel.kt", l = {139}, m = "invokeSuspend", v = 1)
public final class p9c0 extends tje0 implements Function2<v5b, v1b<? super List<? extends c8n>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<String> c;
    public final /* synthetic */ q9c0 d;

    @c0d(c = "com.sportygames.sportykick.viewmodel.SportyKickViewModel$preloadBitmaps$2$1$1", f = "SportyKickViewModel.kt", l = {133}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super c8n>, Object> {
        public int a;
        public final /* synthetic */ q9c0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q9c0 q9c0Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = q9c0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super c8n> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            u7n u7nVar;
            Bitmap bitmapC;
            Context context = this.b.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    nan.a aVar = new nan.a(context);
                    aVar.c = this.c;
                    abn.a(aVar, false);
                    nan nanVarA = aVar.a();
                    m9n m9nVarA = in80.a.a(context);
                    this.a = 1;
                    obj = ((a840) m9nVarA).b(nanVarA, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                dfe0 dfe0Var = obj instanceof dfe0 ? (dfe0) obj : null;
                if (dfe0Var != null && (u7nVar = dfe0Var.a) != null && (bitmapC = zbn.c(u7nVar)) != null) {
                    return new t70(bitmapC);
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9c0(v1b v1bVar, q9c0 q9c0Var, List list) {
        super(2, v1bVar);
        this.c = list;
        this.d = q9c0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p9c0 p9c0Var = new p9c0(v1bVar, this.d, this.c);
        p9c0Var.b = obj;
        return p9c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends c8n>> v1bVar) {
        return ((p9c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            List<String> list = this.c;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ej5.a(v5bVar, null, new a(this.d, (String) it.next(), null), 3));
            }
            this.b = null;
            this.a = 1;
            obj = up1.a(arrayList, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return CollectionsKt.R((Iterable) obj);
    }
}
