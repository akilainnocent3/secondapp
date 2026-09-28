package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sportybet.android.gp.tz.R;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class twz {

    public static abstract class a {

        /* JADX INFO: renamed from: twz$a$a, reason: collision with other inner class name */
        public static final class C1152a extends a {
            public final int a;

            public C1152a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1152a) && this.a == ((C1152a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "Invalid(messageRes=", ")");
            }
        }

        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public static final a a(String str) {
        int i;
        str.getClass();
        if (new Regex("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,64}$").f(str)) {
            return a.b.a;
        }
        if (str.length() < 8) {
            i = R.string.register_login_int__pwd_shorter_error;
        } else {
            i = str.length() > 64 ? R.string.register_login_int__pwd_longer_error : R.string.register_login_int__pwd_letter_invalid_error;
        }
        return new a.C1152a(i);
    }

    public static final boolean b(String str, PasswordEditText passwordEditText) {
        str.getClass();
        passwordEditText.getClass();
        a aVarA = a(str);
        if (aVarA instanceof a.b) {
            return true;
        }
        if (!(aVarA instanceof a.C1152a)) {
            uhc.a();
            return false;
        }
        Context context = passwordEditText.getContext();
        context.getClass();
        passwordEditText.setError(sn5.b(context, ((a.C1152a) aVarA).a, new Object[0]));
        return false;
    }
}
