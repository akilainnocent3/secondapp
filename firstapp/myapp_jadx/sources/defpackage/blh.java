package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b&\u0018\u0000 D2\u00060\u0001j\u0002`\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b#\u0010$JB\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b-\u0010.J\u0015\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b-\u0010/JL\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b5\u0010.J\u0015\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b5\u0010/J!\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b7\u00108J\u0015\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b7\u00109J\u001f\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b:\u00108J\u0015\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b:\u00109J\u001f\u0010<\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010=J!\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b?\u00108J\u0015\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b?\u00109J!\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u00108J\u0015\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u0005¢\u0006\u0004\bA\u00109J\u001f\u0010B\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u000206H\u0016¢\u0006\u0004\bC\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"Lblh;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lcxz;", AnalyticsParam.EVENT_PATH, "canonicalize", "(Lcxz;)Lcxz;", "Lkkh;", "metadata", "(Lcxz;)Lkkh;", "metadataOrNull", "", "exists", "(Lcxz;)Z", "dir", "", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "(Lcxz;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lcxz;Z)Lkotlin/sequences/Sequence;", "(Lcxz;)Lkotlin/sequences/Sequence;", "file", "Lbkh;", "openReadOnly", "(Lcxz;)Lbkh;", "mustCreate", "mustExist", "openReadWrite", "(Lcxz;ZZ)Lbkh;", "Lzpa0;", "source", "(Lcxz;)Lzpa0;", "T", "Lkotlin/Function1;", "Lcc5;", "readerAction", "-read", "(Lcxz;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Luw90;", "sink", "(Lcxz;Z)Luw90;", "(Lcxz;)Luw90;", "Lbc5;", "writerAction", "-write", "(Lcxz;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", "appendingSink", "", "createDirectory", "(Lcxz;Z)V", "(Lcxz;)V", "createDirectories", "target", "atomicMove", "(Lcxz;Lcxz;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "Companion", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class blh implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final blh RESOURCES;
    public static final blh SYSTEM;
    public static final cxz SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: renamed from: blh$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static Object m5write$default(blh blhVar, cxz cxzVar, boolean z, Function1 function1, int i, Object obj) {
        ?? r3;
        Object th = null;
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        cxzVar.getClass();
        function1.getClass();
        x740 x740VarA = z7b.a(blhVar.sink(cxzVar, z));
        try {
            Object objInvoke = function1.invoke(x740VarA);
            try {
                x740VarA.close();
            } catch (Throwable th2) {
                th = th2;
            }
            Object obj2 = th;
            th = objInvoke;
            r3 = obj2;
        } catch (Throwable th3) {
            try {
                x740VarA.close();
                r3 = th3;
            } catch (Throwable th4) {
                rtg.a(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    static {
        blh vgpVar;
        try {
            Class.forName("java.nio.file.Files");
            vgpVar = new wux();
        } catch (ClassNotFoundException unused) {
            vgpVar = new vgp();
        }
        SYSTEM = vgpVar;
        String str = cxz.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = cxz.a.a(property);
        ClassLoader classLoader = ch50.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new ch50(classLoader);
    }

    public static /* synthetic */ uw90 appendingSink$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return blhVar.appendingSink(cxzVar, z);
    }

    public static /* synthetic */ void createDirectories$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        blhVar.createDirectories(cxzVar, z);
    }

    public static /* synthetic */ void createDirectory$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        blhVar.createDirectory(cxzVar, z);
    }

    public static /* synthetic */ void delete$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        blhVar.delete(cxzVar, z);
    }

    public static /* synthetic */ void deleteRecursively$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        blhVar.deleteRecursively(cxzVar, z);
    }

    public static final blh get(FileSystem fileSystem) {
        INSTANCE.getClass();
        fileSystem.getClass();
        return new vux(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return blhVar.listRecursively(cxzVar, z);
    }

    public static /* synthetic */ bkh openReadWrite$default(blh blhVar, cxz cxzVar, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return blhVar.openReadWrite(cxzVar, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m6read(cxz file, Function1<? super cc5, ? extends T> readerAction) {
        ?? r3;
        file.getClass();
        readerAction.getClass();
        y740 y740VarB = z7b.b(source(file));
        T th = null;
        try {
            T tInvoke = readerAction.invoke(y740VarB);
            try {
                y740VarB.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = tInvoke;
        } catch (Throwable th3) {
            try {
                y740VarB.close();
                r3 = th3;
            } catch (Throwable th4) {
                rtg.a(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m7write(cxz file, boolean mustCreate, Function1<? super bc5, ? extends T> writerAction) {
        ?? r3;
        file.getClass();
        writerAction.getClass();
        x740 x740VarA = z7b.a(sink(file, mustCreate));
        T th = null;
        try {
            T tInvoke = writerAction.invoke(x740VarA);
            try {
                x740VarA.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = tInvoke;
        } catch (Throwable th3) {
            try {
                x740VarA.close();
                r3 = th3;
            } catch (Throwable th4) {
                rtg.a(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    public final uw90 appendingSink(cxz file) {
        file.getClass();
        return appendingSink(file, false);
    }

    public abstract uw90 appendingSink(cxz file, boolean mustExist);

    public abstract void atomicMove(cxz source, cxz target);

    public abstract cxz canonicalize(cxz path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copy(cxz source, cxz target) throws Throwable {
        Throwable th;
        Long lValueOf;
        source.getClass();
        target.getClass();
        zpa0 zpa0VarSource = source(source);
        Throwable th2 = null;
        try {
            x740 x740VarA = z7b.a(sink$default(this, target, false, 2, null));
            try {
                lValueOf = Long.valueOf(x740VarA.R0(zpa0VarSource));
                try {
                    x740VarA.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    x740VarA.close();
                } catch (Throwable th5) {
                    rtg.a(th4, th5);
                }
                th = th4;
                lValueOf = null;
            }
            if (th != null) {
                throw th;
            }
            lValueOf.getClass();
            if (zpa0VarSource != null) {
                try {
                    zpa0VarSource.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
        } catch (Throwable th7) {
            th2 = th7;
            if (zpa0VarSource != null) {
                try {
                    zpa0VarSource.close();
                } catch (Throwable th8) {
                    rtg.a(th2, th8);
                }
            }
        }
    }

    public final void createDirectories(cxz dir, boolean mustCreate) throws IOException {
        dir.getClass();
        dir.getClass();
        gx0 gx0Var = new gx0();
        for (cxz cxzVarC = dir; cxzVarC != null && !exists(cxzVarC); cxzVarC = cxzVarC.c()) {
            gx0Var.addFirst(cxzVarC);
        }
        if (mustCreate && gx0Var.isEmpty()) {
            ykh.a(dir, " already exists.");
            return;
        }
        Iterator<E> it = gx0Var.iterator();
        while (it.hasNext()) {
            createDirectory$default(this, (cxz) it.next(), false, 2, null);
        }
    }

    public final void createDirectory(cxz dir) {
        dir.getClass();
        createDirectory(dir, false);
    }

    public abstract void createDirectory(cxz dir, boolean mustCreate);

    public abstract void createSymlink(cxz source, cxz target);

    public final void delete(cxz path) {
        path.getClass();
        delete(path, false);
    }

    public abstract void delete(cxz path, boolean mustExist);

    public void deleteRecursively(cxz fileOrDirectory, boolean mustExist) {
        fileOrDirectory.getClass();
        vc80 vc80VarA = zc80.a(new g(this, fileOrDirectory, null));
        while (vc80VarA.hasNext()) {
            delete((cxz) vc80VarA.next(), mustExist && !vc80VarA.hasNext());
        }
    }

    public final boolean exists(cxz path) {
        path.getClass();
        path.getClass();
        return metadataOrNull(path) != null;
    }

    public abstract List<cxz> list(cxz dir);

    public abstract List<cxz> listOrNull(cxz dir);

    public Sequence<cxz> listRecursively(cxz dir, boolean followSymlinks) {
        dir.getClass();
        return new yc80(new h(dir, this, followSymlinks, null));
    }

    public final kkh metadata(cxz path) throws FileNotFoundException {
        path.getClass();
        path.getClass();
        kkh kkhVarMetadataOrNull = metadataOrNull(path);
        if (kkhVarMetadataOrNull != null) {
            return kkhVarMetadataOrNull;
        }
        throw new FileNotFoundException(alh.a(path, "no such file: "));
    }

    public abstract kkh metadataOrNull(cxz path);

    public abstract bkh openReadOnly(cxz file);

    public final bkh openReadWrite(cxz file) {
        file.getClass();
        return openReadWrite(file, false, false);
    }

    public abstract bkh openReadWrite(cxz file, boolean mustCreate, boolean mustExist);

    public final uw90 sink(cxz file) {
        file.getClass();
        return sink(file, false);
    }

    public abstract uw90 sink(cxz file, boolean mustCreate);

    public abstract zpa0 source(cxz file);

    public static /* synthetic */ uw90 sink$default(blh blhVar, cxz cxzVar, boolean z, int i, Object obj) {
        if (obj != null) {
            zkh.a(CaBJCMnsV.tazGheH);
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return blhVar.sink(cxzVar, z);
    }

    public final Sequence<cxz> listRecursively(cxz dir) {
        dir.getClass();
        return listRecursively(dir, false);
    }

    public final void deleteRecursively(cxz fileOrDirectory) {
        fileOrDirectory.getClass();
        deleteRecursively(fileOrDirectory, false);
    }

    public final void createDirectories(cxz dir) throws IOException {
        dir.getClass();
        createDirectories(dir, false);
    }
}
