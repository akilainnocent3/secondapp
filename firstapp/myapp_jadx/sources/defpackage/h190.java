package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes4.dex */
public final class h190 {
    public final String a;
    public final ResourceUiText b;
    public final String c;
    public final i190 d;

    public h190(String str, ResourceUiText resourceUiText, String str2, i190 i190Var) {
        this.a = str;
        this.b = resourceUiText;
        this.c = str2;
        this.d = i190Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h190)) {
            return false;
        }
        h190 h190Var = (h190) obj;
        return this.a.equals(h190Var.a) && this.b.equals(h190Var.b) && this.c.equals(h190Var.c) && this.d == h190Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SharePreviewImageData(imageUri=" + this.a + ", title=" + this.b + ", caption=" + this.c + ", previewType=" + this.d + ")";
    }
}
