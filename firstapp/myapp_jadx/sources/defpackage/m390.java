package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m390<T> implements kpc<T> {
    public final Function2<T, v1b<? super Boolean>, Object> a;
    public final gaj<u390, T, v1b<? super T>, Object> b;
    public final Context c;
    public final String d;
    public final mpe0 e;
    public final LinkedHashSet f;

    public static final class a extends qlr implements Function0<SharedPreferences> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            super(0);
            this.a = context;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences(this.b, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
    }

    public static final class b {
        public static final boolean a(Context context, String str) {
            context.getClass();
            str.getClass();
            return context.deleteSharedPreferences(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m390(Context context, String str, Set<String> set, Function2<? super T, ? super v1b<? super Boolean>, ? extends Object> function2, gaj<? super u390, ? super T, ? super v1b<? super T>, ? extends Object> gajVar) {
        context.getClass();
        set.getClass();
        function2.getClass();
        a aVar = new a(context, str);
        this.a = function2;
        this.b = gajVar;
        this.c = context;
        this.d = str;
        this.e = hwr.b(aVar);
        this.f = set == r390.a ? null : CollectionsKt.D0(set);
    }

    @Override // defpackage.kpc
    public final Unit h() throws IOException {
        Context context;
        String str;
        mpe0 mpe0Var = this.e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) mpe0Var.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            i08.a("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) mpe0Var.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            b.a(context, str);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.a;
    }

    @Override // defpackage.kpc
    public final Object i(Object obj, npc npcVar) {
        return this.b.invoke(new u390((SharedPreferences) this.e.getValue(), this.f), obj, npcVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kpc
    public final Object j(Object obj, x1b x1bVar) {
        n390 n390Var;
        if (x1bVar instanceof n390) {
            n390Var = (n390) x1bVar;
            int i = n390Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n390Var.d = i - Integer.MIN_VALUE;
            } else {
                n390Var = new n390(this, x1bVar);
            }
        } else {
            n390Var = new n390(this, x1bVar);
        }
        Object objInvoke = n390Var.b;
        y5b y5bVar = y5b.a;
        int i2 = n390Var.d;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objInvoke);
            n390Var.a = this;
            n390Var.d = 1;
            objInvoke = this.a.invoke(obj, n390Var);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = n390Var.a;
            uj50.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = this.f;
        mpe0 mpe0Var = this.e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) mpe0Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) mpe0Var.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public m390(Context context, String str, Set set, p390 p390Var, gaj gajVar, int i) {
        this(context, str, (i & 4) != 0 ? r390.a : set, (i & 8) != 0 ? new l390(2, null) : p390Var, gajVar);
    }
}
