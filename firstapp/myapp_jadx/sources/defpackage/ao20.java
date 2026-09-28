package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ao20 {
    public final Context a;
    public final String b;
    public final mpe0 c;
    public final ArrayList d;

    public final class a<T> extends b<T> {
        public final /* synthetic */ ao20 a;

        public a(ao20 ao20Var) {
            d[] dVarArr = d.a;
            this.a = ao20Var;
        }

        public final void a(ohp ohpVar, String str) {
            ohpVar.getClass();
            d[] dVarArr = d.a;
            ao20 ao20Var = this.a;
            Object value = ao20Var.c.getValue();
            value.getClass();
            ((SharedPreferences) value).edit().putString(ohpVar.getName(), str).apply();
            ArrayList arrayList = ao20Var.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((c) obj).a();
            }
        }
    }

    public static abstract class b<T> {
    }

    public interface c {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final /* synthetic */ d[] a = {new d("String", 0), new d("Int", 1), new d("Float", 2), new d("Boolean", 3), new d("Long", 4), new d("StringSet", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        d EF5;

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) a.clone();
        }
    }

    public ao20(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = hwr.b(new Function0() { // from class: yn20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ao20 ao20Var = this.a;
                return ao20Var.a.getSharedPreferences(ao20Var.b, 0);
            }
        });
        this.d = new ArrayList();
    }

    public static a a(ao20 ao20Var) {
        d[] dVarArr = d.a;
        return new a(ao20Var);
    }
}
