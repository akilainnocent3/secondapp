package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.cms.repositories.CMSRepository$saveFileCall$2", f = "CMSRepository.kt", l = {138}, m = "invokeSuspend", v = 1)
public final class vo5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public so5 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ HashMap<String, String> d;
    public final /* synthetic */ so5 e;
    public final /* synthetic */ to5 f;

    @c0d(c = "com.sportygames.cms.repositories.CMSRepository$saveFileCall$2$1", f = "CMSRepository.kt", l = {132}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super File>, Object> {
        public int a;
        public final /* synthetic */ HashMap<String, String> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ to5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<String, String> map, String str, to5 to5Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = map;
            this.c = str;
            this.d = to5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super File> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    String str2 = this.b.get(str);
                    if (str2 != null) {
                        to5 to5Var = this.d;
                        this.a = 1;
                        pfd pfdVar = fse.a;
                        obj = ej5.d(odd.b, new uo5(to5Var, str2, str, null), this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                File file = (File) obj;
                return file == null ? new File("") : file;
            } catch (Exception unused) {
                return new File("");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo5(HashMap map, so5 so5Var, to5 to5Var, v1b v1bVar) {
        super(2, v1bVar);
        this.d = map;
        this.e = so5Var;
        this.f = to5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vo5 vo5Var = new vo5(this.d, this.e, this.f, v1bVar);
        vo5Var.c = obj;
        return vo5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vo5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        so5 so5Var;
        v5b v5bVar = (v5b) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            ArrayList arrayListA = j9f.a(obj);
            HashMap<String, String> map = this.d;
            for (String str : map.keySet()) {
                str.getClass();
                arrayListA.add(ej5.a(v5bVar, null, new a(map, str, this.f, null), 3));
            }
            this.c = null;
            so5 so5Var2 = this.e;
            this.a = so5Var2;
            this.b = 1;
            obj = up1.a(arrayListA, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            so5Var = so5Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            so5Var = this.a;
            uj50.b(obj);
        }
        so5Var.invoke(obj);
        return Unit.a;
    }
}
