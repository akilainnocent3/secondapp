package u1;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(24)
public final class w implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f137566a;

    public w(Object obj) {
        this.f137566a = m.a(obj);
    }

    @Override // u1.p
    public String a() {
        return this.f137566a.toLanguageTags();
    }

    @Override // u1.p
    @Nullable
    public Locale b(@NonNull String[] strArr) {
        return this.f137566a.getFirstMatch(strArr);
    }

    @Override // u1.p
    public int c(Locale locale) {
        return this.f137566a.indexOf(locale);
    }

    public boolean equals(Object obj) {
        return this.f137566a.equals(((p) obj).getLocaleList());
    }

    @Override // u1.p
    public Locale get(int i10) {
        return this.f137566a.get(i10);
    }

    @Override // u1.p
    public Object getLocaleList() {
        return this.f137566a;
    }

    public int hashCode() {
        return this.f137566a.hashCode();
    }

    @Override // u1.p
    public boolean isEmpty() {
        return this.f137566a.isEmpty();
    }

    @Override // u1.p
    public int size() {
        return this.f137566a.size();
    }

    public String toString() {
        return this.f137566a.toString();
    }
}
