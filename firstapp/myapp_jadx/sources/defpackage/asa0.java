package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes4.dex */
public final class asa0 implements anf0<CharSequence> {
    public final Context a;
    public final SpannableStringBuilder b;

    public asa0(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = new SpannableStringBuilder(str);
    }

    @Override // defpackage.anf0
    public final anf0<CharSequence> b(String str) {
        this.b.append((CharSequence) str);
        return this;
    }

    @Override // defpackage.anf0
    public final anf0<CharSequence> c(Object obj, String str) {
        str.getClass();
        boolean z = obj instanceof UiText;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (z) {
            spannableStringBuilder.append(((UiText) obj).e(this.a));
            return this;
        }
        if (obj instanceof CharSequence) {
            spannableStringBuilder.append((CharSequence) obj);
            return this;
        }
        if (obj != null) {
            spannableStringBuilder.append((CharSequence) anf0.a(obj, str));
            return this;
        }
        spannableStringBuilder.append((CharSequence) "");
        return this;
    }

    @Override // defpackage.anf0
    public final String d() {
        String string = this.b.toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.anf0
    public final CharSequence e() {
        return this.b;
    }
}
