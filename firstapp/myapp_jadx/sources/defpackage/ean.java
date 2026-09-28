package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.util.ImagePrefetchUtilsKt$prefetchBatch$2", f = "ImagePrefetchUtils.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class ean extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<Object> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m9n e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ Integer i;

    @c0d(c = "com.sporty.android.compose.ui.util.ImagePrefetchUtilsKt$prefetchBatch$2$1$1", f = "ImagePrefetchUtils.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ m9n c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ Integer f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m9n m9nVar, Context context, Object obj, Integer num, v1b v1bVar) {
            super(2, v1bVar);
            this.c = m9nVar;
            this.d = context;
            this.e = obj;
            this.f = num;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    m9n m9nVar = this.c;
                    Context context = this.d;
                    Object obj2 = this.e;
                    Integer num = this.f;
                    zi50.a aVar = zi50.b;
                    this.b = null;
                    this.a = 1;
                    if (gan.c(m9nVar, context, obj2, num, true, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = Unit.a;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            return new zi50(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ean(List list, int i, m9n m9nVar, Context context, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.c = list;
        this.d = i;
        this.e = m9nVar;
        this.f = context;
        this.i = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ean eanVar = new ean(this.c, this.d, this.e, this.f, this.i, v1bVar);
        eanVar.b = obj;
        return eanVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ean) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            List<Object> list = this.c;
            if (list.isEmpty() || (i = this.d) <= 0) {
                return Unit.a;
            }
            pfd pfdVar = fse.a;
            k5b k5bVarG0 = odd.b.g0(i);
            List listA0 = CollectionsKt.A0(CollectionsKt.D0(list));
            ArrayList arrayList = new ArrayList(l48.r(listA0, 10));
            Iterator it = listA0.iterator();
            while (it.hasNext()) {
                arrayList.add(ej5.a(v5bVar, k5bVarG0, new a(this.e, this.f, it.next(), this.i, null), 2));
            }
            this.b = null;
            this.a = 1;
            if (up1.a(arrayList, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
