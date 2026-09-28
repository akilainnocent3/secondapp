package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.cms.repositories.CMSRepository$apiCall$coroutineExceptionHandler$1$1", f = "CMSRepository.kt", l = {75}, m = "invokeSuspend", v = 1)
public final class qo5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ro5 b;
    public final /* synthetic */ to5 c;
    public final /* synthetic */ List<String> d;

    @c0d(c = "com.sportygames.cms.repositories.CMSRepository$apiCall$coroutineExceptionHandler$1$1$1", f = "CMSRepository.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ro5 a;
        public final /* synthetic */ to5 b;
        public final /* synthetic */ List<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ro5 ro5Var, to5 to5Var, v1b v1bVar, List list) {
            super(2, v1bVar);
            this.a = ro5Var;
            this.b = to5Var;
            this.c = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0051  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            File file;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Context context = this.b.a;
            File fileB = context != null ? to5.b(context) : null;
            File[] fileArrListFiles = fileB != null ? fileB.listFiles() : null;
            HashMap map = new HashMap();
            for (String str : this.c) {
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            file = null;
                            break;
                        }
                        file = fileArrListFiles[i];
                        if (Intrinsics.g(file.getName(), str)) {
                            break;
                        }
                        i++;
                    }
                    if (file == null || !file.isFile()) {
                        file = null;
                    }
                } else {
                    file = null;
                }
                map.put(str, file != null ? nlh.c(file) : "");
            }
            this.a.invoke(map);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo5(ro5 ro5Var, to5 to5Var, v1b v1bVar, List list) {
        super(2, v1bVar);
        this.b = ro5Var;
        this.c = to5Var;
        this.d = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qo5(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qo5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            a aVar = new a(this.b, this.c, null, this.d);
            this.a = 1;
            if (ej5.d(oddVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
