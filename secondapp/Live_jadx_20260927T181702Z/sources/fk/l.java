package fk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84848d = "aqs.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FilenameFilter f84849e = new FilenameFilter() { // from class: fk.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(l.f84848d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f84850f = new Comparator() { // from class: fk.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk.g f84851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f84852b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f84853c = null;

    public l(lk.g gVar) {
        this.f84851a = gVar;
    }

    public static void d(lk.g gVar, @Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.r(str, f84848d + str2).createNewFile();
        } catch (IOException e10) {
            ck.g.f().n("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    @Nullable
    @h1
    public static String e(lk.g gVar, @NonNull String str) {
        List<File> listS = gVar.s(str, f84849e);
        if (!listS.isEmpty()) {
            return ((File) Collections.min(listS, f84850f)).getName().substring(4);
        }
        ck.g.f().m("Unable to read App Quality Sessions session id.");
        return null;
    }

    @Nullable
    public synchronized String c(@NonNull String str) {
        if (Objects.equals(this.f84852b, str)) {
            return this.f84853c;
        }
        return e(this.f84851a, str);
    }

    public synchronized void f(@NonNull String str) {
        if (!Objects.equals(this.f84853c, str)) {
            d(this.f84851a, this.f84852b, str);
            this.f84853c = str;
        }
    }

    public synchronized void g(@Nullable String str) {
        if (!Objects.equals(this.f84852b, str)) {
            d(this.f84851a, str, this.f84853c);
            this.f84852b = str;
        }
    }
}
