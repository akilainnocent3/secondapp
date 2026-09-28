package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class to5 implements vmy {
    public Context a;
    public String b = "en";

    @c0d(c = "com.sportygames.cms.repositories.CMSRepository$cmsApiCalls$1", f = "CMSRepository.kt", l = {50}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList<String> c;
        public final /* synthetic */ Function1<ArrayList<File>, Unit> d;

        /* JADX INFO: renamed from: to5$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.cms.repositories.CMSRepository$cmsApiCalls$1$1$1", f = "CMSRepository.kt", l = {52}, m = "invokeSuspend", v = 1)
        public static final class C1141a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ to5 b;
            public final /* synthetic */ HashMap<String, String> c;
            public final /* synthetic */ ArrayList<File> d;
            public final /* synthetic */ Function1<ArrayList<File>, Unit> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1141a(to5 to5Var, HashMap<String, String> map, ArrayList<File> arrayList, Function1<? super ArrayList<File>, Unit> function1, v1b<? super C1141a> v1bVar) {
                super(2, v1bVar);
                this.b = to5Var;
                this.c = map;
                this.d = arrayList;
                this.e = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1141a(this.b, this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1141a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [so5] */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    to5 to5Var = this.b;
                    HashMap<String, String> map = this.c;
                    final ArrayList<File> arrayList = this.d;
                    final Function1<ArrayList<File>, Unit> function1 = this.e;
                    ?? r4 = new Function1() { // from class: so5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ArrayList arrayList2 = arrayList;
                            arrayList2.addAll((List) obj2);
                            function1.invoke(arrayList2);
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    try {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(odd.b), null, null, new vo5(map, r4, to5Var, null), 3);
                    } catch (Exception unused) {
                    }
                    if (Unit.a == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ArrayList<String> arrayList, Function1<? super ArrayList<File>, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = arrayList;
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return to5.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                ArrayList arrayListA = j9f.a(obj);
                to5 to5Var = to5.this;
                ro5 ro5Var = new ro5(to5Var, arrayListA, this.d);
                this.a = 1;
                ArrayList<String> arrayList = this.c;
                oo5 oo5Var = new oo5(ro5Var, to5Var, arrayList);
                try {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(odd.b.plus(oo5Var)), null, null, new po5(ro5Var, to5Var, null, arrayList), 3);
                } catch (Exception unused) {
                }
                if (Unit.a == y5bVar) {
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

    public static File b(Context context) {
        File file = new File(context.getFilesDir(), "cms");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // defpackage.vmy
    public final void a(ArrayList<String> arrayList, Function1<? super ArrayList<File>, Unit> function1, Context context) {
        arrayList.getClass();
        context.getClass();
        this.a = context;
        try {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(odd.b), null, null, new a(arrayList, function1, null), 3);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.vmy
    public final void setLanguageCode(String str) {
        str.getClass();
        this.b = str;
    }
}
