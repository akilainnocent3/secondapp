package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class el3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f148768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3 f148769b;

    public el3(Context context) {
        this(oy2.a(new oy2(), context, "ViewSizeInfoStorage"), new cl3());
    }

    public static String a(fl3 fl3Var) {
        return fl3Var.a() + TokenBuilder.TOKEN_DELIMITER + fl3Var.b();
    }

    public final void a(fl3 fl3Var, bl3 bl3Var) throws JSONException {
        String strA = a(fl3Var);
        this.f148769b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", bl3Var.f147260a.f146855a);
        jSONObject2.put("height", bl3Var.f147260a.f146856b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", bl3Var.f147261b.f146783a);
        jSONObject3.put("height", bl3Var.f147261b.f146784b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", bl3Var.f147262c.f151124a.f151557a);
        String strName = bl3Var.f147262c.f151124a.f151558b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        jSONObject4.put(C4235d4.a.f61301t, lowerCase);
        jSONObject5.put("value", bl3Var.f147262c.f151125b.f151557a);
        String lowerCase2 = bl3Var.f147262c.f151125b.f151558b.name().toLowerCase(locale);
        kotlin.jvm.internal.m0.o(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(C4235d4.a.f61301t, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(bl3Var.f147263d);
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String string = jSONObject.toString();
        SharedPreferences.Editor editorEdit = this.f148768a.edit();
        editorEdit.putString(strA, string);
        editorEdit.apply();
    }

    public el3(SharedPreferences sharedPreferences, cl3 cl3Var) {
        this.f148768a = sharedPreferences;
        this.f148769b = cl3Var;
    }
}
