package defpackage;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ci40 {
    public static final zn20.a<String> c = new zn20.a<>("recent_queries");
    public static final Type d;
    public final Context a;
    public final JsonSerializeService b;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"ci40$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    static {
        Type type = new a().getType();
        type.getClass();
        d = type;
    }

    public ci40(Context context, JsonSerializeService jsonSerializeService) {
        jsonSerializeService.getClass();
        this.a = context;
        this.b = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        di40 di40Var;
        if (x1bVar instanceof di40) {
            di40Var = (di40) x1bVar;
            int i = di40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                di40Var.c = i - Integer.MIN_VALUE;
            } else {
                di40Var = new di40(this, x1bVar);
            }
        } else {
            di40Var = new di40(this, x1bVar);
        }
        Object obj = di40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = di40Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            String string = StringsKt.t0(str).toString();
            if (string.length() == 0) {
                return Unit.a;
            }
            sqc<zn20> sqcVarA = ii40.b.a(this.a, ii40.a[0]);
            ei40 ei40Var = new ei40(this, string, null);
            di40Var.c = 1;
            if (do20.a(sqcVarA, ei40Var, di40Var) == y5bVar) {
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

    public final List<String> b(String str) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return m2g.a;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = (List) this.b.fromJson(str, d);
            if (bVar == null) {
                bVar = m2g.a;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = m2g.a;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return (List) bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        gi40 gi40Var;
        if (x1bVar instanceof gi40) {
            gi40Var = (gi40) x1bVar;
            int i = gi40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi40Var.c = i - Integer.MIN_VALUE;
            } else {
                gi40Var = new gi40(this, x1bVar);
            }
        } else {
            gi40Var = new gi40(this, x1bVar);
        }
        Object obj = gi40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = gi40Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = ii40.b.a(this.a, ii40.a[0]);
            hi40 hi40Var = new hi40(this, str, null);
            gi40Var.c = 1;
            if (do20.a(sqcVarA, hi40Var, gi40Var) == y5bVar) {
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
