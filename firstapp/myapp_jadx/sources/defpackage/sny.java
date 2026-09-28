package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.reflect.TypeToken;
import com.sportygames.commons.models.OnboardingItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sny {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"sny$a", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "Lcom/sportygames/commons/models/OnboardingItem;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends TypeToken<ArrayList<OnboardingItem>> {
    }

    public static final ArrayList<OnboardingItem> a(Context context, String str) {
        context.getClass();
        str.getClass();
        String str2 = str + "-version";
        SharedPreferences sharedPreferencesA = un20.a(context);
        eal ealVar = new eal();
        String string = sharedPreferencesA != null ? sharedPreferencesA.getString(str, "") : null;
        boolean z = false;
        int i = sharedPreferencesA != null ? sharedPreferencesA.getInt(str2, 0) : 0;
        if (string == null || string.length() == 0) {
            return new ArrayList<>();
        }
        Type type = new a().getType();
        type.getClass();
        Object objF = ealVar.f(string, type);
        objF.getClass();
        ArrayList<OnboardingItem> arrayListF = (ArrayList) objF;
        if (!Intrinsics.g(str, "sporty-hero")) {
            return arrayListF;
        }
        try {
            int size = arrayListF.size();
            if (i >= 1) {
                return arrayListF;
            }
            OnboardingItem onboardingItem = new OnboardingItem(0, Boolean.valueOf(size > 0 && Intrinsics.g(arrayListF.get(0).getIsView(), Boolean.TRUE)));
            Boolean bool = Boolean.FALSE;
            OnboardingItem onboardingItem2 = new OnboardingItem(1, bool);
            OnboardingItem onboardingItem3 = new OnboardingItem(2, bool);
            if (size > 1 && Intrinsics.g(arrayListF.get(1).getIsView(), Boolean.TRUE)) {
                z = true;
            }
            arrayListF = b.f(onboardingItem, onboardingItem2, onboardingItem3, new OnboardingItem(3, Boolean.valueOf(z)));
            b(sharedPreferencesA.edit(), arrayListF, str);
            sharedPreferencesA.edit().putInt(str2, 1).apply();
            return arrayListF;
        } catch (Exception e) {
            e.printStackTrace();
            return arrayListF;
        }
    }

    public static final void b(SharedPreferences.Editor editor, ArrayList<OnboardingItem> arrayList, String str) {
        str.getClass();
        String strJ = new eal().j(arrayList);
        if (editor != null) {
            editor.putString(str, strJ);
        }
        if (editor != null) {
            editor.apply();
        }
    }

    public static final void c(Context context, SharedPreferences.Editor editor, int i, String str) {
        context.getClass();
        str.getClass();
        ArrayList<OnboardingItem> arrayListA = a(context, str);
        if (arrayListA.isEmpty() || i < 0) {
            return;
        }
        int size = arrayListA.size();
        if (i < size) {
            arrayListA.get(i).setView(Boolean.TRUE);
        } else if (size <= i) {
            while (true) {
                arrayListA.add(new OnboardingItem(Integer.valueOf(i), Boolean.TRUE));
                if (size == i) {
                    break;
                } else {
                    size++;
                }
            }
        }
        String strJ = new eal().j(arrayListA);
        if (editor != null) {
            editor.putString(str, strJ);
        }
        if (editor != null) {
            editor.apply();
        }
    }
}
