package nd;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import cd.b;
import cd.d;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import ld.c;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f116440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f116441b = new c();

    public a(Context context) {
        this.f116440a = context.getSharedPreferences("odt_storage", 0);
    }

    public final String a() {
        String string = this.f116440a.getString("odt", null);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            String string2 = jSONArray.getString(0);
            return this.f116441b.b(jSONArray.getString(1), Base64.decode(string2, 0));
        } catch (IOException e10) {
            e = e10;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidKeyException e12) {
            e = e12;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchPaddingException e14) {
            e = e14;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (JSONException e15) {
            e = e15;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (Exception e16) {
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e16, cd.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        }
    }

    public final void b(String str) {
        try {
            Pair pairA = this.f116441b.a(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pairA.first).put(pairA.second);
            this.f116440a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e10) {
            e = e10;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e12) {
            e = e12;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e14) {
            e = e14;
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e15) {
            b.b(d.ENCRYPTION_EXCEPTION, kd.a.a(e15, cd.c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }
}
