package okhttp3.internal.cache;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bc5;
import defpackage.bf4;
import defpackage.blh;
import defpackage.cxz;
import defpackage.ddk0;
import defpackage.dhp;
import defpackage.efa;
import defpackage.hb5;
import defpackage.i08;
import defpackage.ib5;
import defpackage.jre;
import defpackage.jui;
import defpackage.kb5;
import defpackage.kre;
import defpackage.lrh0;
import defpackage.rtg;
import defpackage.uf80;
import defpackage.uw90;
import defpackage.x740;
import defpackage.y740;
import defpackage.z7b;
import defpackage.zdf0;
import defpackage.zpa0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004XYZWB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u00020\u00112\n\u0010!\u001a\u00060\u001cR\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\"2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010\u0013J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u0013J\r\u00103\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0013J\r\u00104\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0013J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000005¢\u0006\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR*\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010 \"\u0004\bH\u0010IR>\u0010P\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u00000Jj\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u0000`K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010V\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u00100\"\u0004\bT\u0010U¨\u0006["}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "Lblh;", "fileSystem", "Lcxz;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lblh;Lcxz;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "initialize", "()V", "rebuildJournal$okhttp", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", "", AnalyticsParam.EVENT_PARAM_SUCCESS, "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "()Z", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "trimToSize", "delete", "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "a", "Lcxz;", "getDirectory", "()Lcxz;", "c", "I", "getValueCount$okhttp", "()I", "d", "Lblh;", "getFileSystem$okhttp", "()Lblh;", "value", "e", "J", "getMaxSize", "setMaxSize", "(J)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "z", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "E", "Z", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "closed", "Companion", "Snapshot", "Editor", "Entry", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DiskLruCache implements Closeable, Flushable, Lockable {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean closed;
    public boolean F;
    public boolean G;
    public long H;
    public final TaskQueue I;
    public final DiskLruCache$cleanupTask$1 J;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final cxz directory;
    public final int b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int valueCount;
    public final DiskLruCache$fileSystem$1 d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long maxSize;
    public final cxz f;
    public final cxz i;
    public final cxz v;
    public long w;
    public bc5 y;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final LinkedHashMap<String, Entry> lruEntries;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "<init>", "()V", "JOURNAL_FILE", "", "JOURNAL_FILE_TEMP", "JOURNAL_FILE_BACKUP", "MAGIC", "VERSION_1", "ANY_SEQUENCE_NUMBER", "", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "CLEAN", "DIRTY", "REMOVE", "READ", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "", "detach$okhttp", "()V", "detach", "", "index", "Lzpa0;", "newSource", "(I)Lzpa0;", "Luw90;", "newSink", "(I)Luw90;", "commit", "abort", "a", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "b", "[Z", "getWritten$okhttp", "()[Z", "written", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Editor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Entry entry;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean[] written;
        public boolean c;
        public final /* synthetic */ DiskLruCache d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            entry.getClass();
            this.d = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.g(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.c = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.g(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.c = true;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            Entry entry = this.entry;
            if (Intrinsics.g(entry.getCurrentEditor(), this)) {
                DiskLruCache diskLruCache = this.d;
                if (diskLruCache.C) {
                    diskLruCache.completeEdit$okhttp(this, false);
                } else {
                    entry.setZombie$okhttp(true);
                }
            }
        }

        /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final uw90 newSink(int index) {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.g(this.entry.getCurrentEditor(), this)) {
                        return new bf4();
                    }
                    if (!this.entry.getReadable()) {
                        boolean[] zArr = this.written;
                        zArr.getClass();
                        zArr[index] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(index)), new efa(1, diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new bf4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final zpa0 newSource(int index) {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                if (this.c) {
                    throw new IllegalStateException("Check failed.");
                }
                zpa0 zpa0VarSource = null;
                if (!this.entry.getReadable() || !Intrinsics.g(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    zpa0VarSource = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (FileNotFoundException unused) {
                }
                return zpa0VarSource;
            }
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0015\u001a\b\u0018\u00010\u0011R\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R(\u0010=\u001a\b\u0018\u000106R\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lbc5;", "writer", "writeLengths$okhttp", "(Lbc5;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "a", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "b", "[J", "getLengths$okhttp", "()[J", "lengths", "", "Lcxz;", "c", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "cleanFiles", "d", "getDirtyFiles$okhttp", "dirtyFiles", "", "e", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "readable", "f", "getZombie$okhttp", "setZombie$okhttp", "zombie", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "g", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "currentEditor", "", "h", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "lockingSourceCount", "", "i", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Entry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long[] lengths;
        public final ArrayList c;
        public final ArrayList d;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean readable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean zombie;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public Editor currentEditor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public int lockingSourceCount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public long sequenceNumber;
        public final /* synthetic */ DiskLruCache j;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.j = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sb.append(i);
                this.c.add(this.j.getDirectory().e(sb.toString()));
                sb.append(".tmp");
                this.d.add(this.j.getDirectory().e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final List<cxz> getCleanFiles$okhttp() {
            return this.c;
        }

        /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final List<cxz> getDirtyFiles$okhttp() {
            return this.d;
        }

        /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) throws IOException {
            strings.getClass();
            if (strings.size() != this.j.getValueCount()) {
                jre.a(strings, "unexpected journal line: ");
                return;
            }
            try {
                int size = strings.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(strings.get(i));
                }
            } catch (NumberFormatException unused) {
                jre.a(strings, "unexpected journal line: ");
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            boolean z = _UtilJvmKt.assertionsEnabled;
            final DiskLruCache diskLruCache = this.j;
            if (z && !Thread.holdsLock(diskLruCache)) {
                ddk0.a(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
                return null;
            }
            if (this.readable && (diskLruCache.C || (this.currentEditor == null && !this.zombie))) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                try {
                    int valueCount = diskLruCache.getValueCount();
                    for (int i2 = 0; i2 < valueCount; i2++) {
                        final zpa0 zpa0VarSource = diskLruCache.getFileSystem$okhttp().source((cxz) this.c.get(i2));
                        if (!diskLruCache.C) {
                            this.lockingSourceCount++;
                            zpa0VarSource = new jui(zpa0VarSource) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                                public boolean b;

                                @Override // defpackage.jui, java.io.Closeable, java.lang.AutoCloseable
                                public void close() throws IOException {
                                    super.close();
                                    if (this.b) {
                                        return;
                                    }
                                    this.b = true;
                                    DiskLruCache diskLruCache2 = diskLruCache;
                                    DiskLruCache.Entry entry = this;
                                    synchronized (diskLruCache2) {
                                        try {
                                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                                            if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                                diskLruCache2.removeEntry$okhttp(entry);
                                            }
                                            Unit unit = Unit.a;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            };
                        }
                        arrayList.add(zpa0VarSource);
                    }
                    return new Snapshot(this.j, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        _UtilCommonKt.closeQuietly((zpa0) obj);
                    }
                    try {
                        diskLruCache.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                }
            }
            return null;
        }

        public final void writeLengths$okhttp(bc5 writer) {
            writer.getClass();
            for (long j : this.lengths) {
                writer.writeByte(32).s0(j);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\rJ\u0013\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lzpa0;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "getSource", "(I)Lzpa0;", "getLength", "(I)J", "", AnalyticsParam.STORY_SKIP_REASON_CLOSE, "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Snapshot implements Closeable {
        public final String a;
        public final long b;
        public final List<zpa0> c;
        public final long[] d;
        public final /* synthetic */ DiskLruCache e;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends zpa0> list, long[] jArr) {
            str.getClass();
            list.getClass();
            jArr.getClass();
            this.e = diskLruCache;
            this.a = str;
            this.b = j;
            this.c = list;
            this.d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<zpa0> it = this.c.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.e.edit(this.a, this.b);
        }

        public final long getLength(int index) {
            return this.d[index];
        }

        public final zpa0 getSource(int index) {
            return this.c.get(index);
        }

        /* JADX INFO: renamed from: key, reason: from getter */
        public final String getA() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "()Z", "next", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "remove", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Snapshot>, dhp {
        public final Iterator<Entry> a;
        public Snapshot b;
        public Snapshot c;

        public AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            it.getClass();
            this.a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.b != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed()) {
                    return false;
                }
                while (this.a.hasNext()) {
                    Entry next = this.a.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.b = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                Unit unit = Unit.a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                lrh0.a();
                return null;
            }
            Snapshot snapshot = this.b;
            this.c = snapshot;
            this.b = null;
            snapshot.getClass();
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.c;
            if (snapshot == null) {
                ib5.a("remove() before next()");
                return;
            }
            try {
                DiskLruCache.this.remove(snapshot.getA());
            } catch (IOException unused) {
            } finally {
                this.c = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(blh blhVar, cxz cxzVar, int i, int i2, long j, TaskRunner taskRunner) {
        blhVar.getClass();
        cxzVar.getClass();
        taskRunner.getClass();
        this.directory = cxzVar;
        this.b = i;
        this.valueCount = i2;
        this.d = new DiskLruCache$fileSystem$1(blhVar);
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.I = taskRunner.newQueue();
        final String strA = uf80.a(new StringBuilder(), _UtilJvmKt.okHttpName, " Cache");
        this.J = new Task(strA) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.D || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.F = true;
                    }
                    try {
                        if (diskLruCache.f()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.A = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.G = true;
                        bc5 bc5Var = diskLruCache.y;
                        if (bc5Var != null) {
                            _UtilCommonKt.closeQuietly(bc5Var);
                        }
                        diskLruCache.y = new x740(new bf4());
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            hb5.a("maxSize <= 0");
            throw null;
        }
        if (i2 <= 0) {
            hb5.a("valueCount <= 0");
            throw null;
        }
        this.f = cxzVar.e(JOURNAL_FILE);
        this.i = cxzVar.e(JOURNAL_FILE_TEMP);
        this.v = cxzVar.e(JOURNAL_FILE_BACKUP);
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    public static void o(String str) {
        if (LEGAL_KEY_PATTERN.f(str)) {
            return;
        }
        kb5.a(zdf0.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor;
        try {
            if (this.D && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                collectionValues.getClass();
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    entry.getClass();
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                bc5 bc5Var = this.y;
                if (bc5Var != null) {
                    _UtilCommonKt.closeQuietly(bc5Var);
                }
                this.y = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean success) {
        editor.getClass();
        Entry entry = editor.getEntry();
        if (!Intrinsics.g(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (success && !entry.getReadable()) {
            int i = this.valueCount;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] written = editor.getWritten();
                written.getClass();
                if (!written[i2]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.d.exists(entry.getDirtyFiles$okhttp().get(i2))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i3 = this.valueCount;
        for (int i4 = 0; i4 < i3; i4++) {
            cxz cxzVar = entry.getDirtyFiles$okhttp().get(i4);
            if (!success || entry.getZombie()) {
                _UtilCommonKt.deleteIfExists(this.d, cxzVar);
            } else if (this.d.exists(cxzVar)) {
                cxz cxzVar2 = entry.getCleanFiles$okhttp().get(i4);
                this.d.atomicMove(cxzVar, cxzVar2);
                long j = entry.getLengths()[i4];
                Long l = this.d.metadata(cxzVar2).d;
                long jLongValue = l != null ? l.longValue() : 0L;
                entry.getLengths()[i4] = jLongValue;
                this.w = (this.w - j) + jLongValue;
            }
        }
        entry.setCurrentEditor$okhttp(null);
        if (entry.getZombie()) {
            removeEntry$okhttp(entry);
            return;
        }
        this.A++;
        bc5 bc5Var = this.y;
        bc5Var.getClass();
        if (entry.getReadable() || success) {
            entry.setReadable$okhttp(true);
            bc5Var.R(CLEAN).writeByte(32);
            bc5Var.R(entry.getKey());
            entry.writeLengths$okhttp(bc5Var);
            bc5Var.writeByte(10);
            if (success) {
                long j2 = this.H;
                this.H = 1 + j2;
                entry.setSequenceNumber$okhttp(j2);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            bc5Var.R(REMOVE).writeByte(32);
            bc5Var.R(entry.getKey());
            bc5Var.writeByte(10);
        }
        bc5Var.flush();
        if (this.w > this.maxSize || f()) {
            TaskQueue.schedule$default(this.I, this.J, 0L, 2, null);
        }
    }

    public final synchronized void d() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void delete() throws IOException {
        close();
        _UtilCommonKt.deleteContents(this.d, this.directory);
    }

    public final synchronized Editor edit(String key, long expectedSequenceNumber) {
        key.getClass();
        initialize();
        d();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.F && !this.G) {
            bc5 bc5Var = this.y;
            bc5Var.getClass();
            bc5Var.R(DIRTY).writeByte(32).R(key).writeByte(10);
            bc5Var.flush();
            if (this.B) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.I, this.J, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            collectionValues.getClass();
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                entry.getClass();
                removeEntry$okhttp(entry);
            }
            this.F = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean f() {
        int i = this.A;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.D) {
            d();
            trimToSize();
            bc5 bc5Var = this.y;
            bc5Var.getClass();
            bc5Var.flush();
        }
    }

    public final void g() {
        cxz cxzVar = this.i;
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.d;
        _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, cxzVar);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.getClass();
            Entry entry = next;
            Editor currentEditor = entry.getCurrentEditor();
            int i = this.valueCount;
            int i2 = 0;
            if (currentEditor == null) {
                while (i2 < i) {
                    this.w += entry.getLengths()[i2];
                    i2++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                while (i2 < i) {
                    _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, entry.getCleanFiles$okhttp().get(i2));
                    _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, entry.getDirtyFiles$okhttp().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final synchronized Snapshot get(String key) {
        key.getClass();
        initialize();
        d();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.A++;
        bc5 bc5Var = this.y;
        bc5Var.getClass();
        bc5Var.R(READ).writeByte(32).R(key).writeByte(10);
        if (f()) {
            TaskQueue.schedule$default(this.I, this.J, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final cxz getDirectory() {
        return this.directory;
    }

    public final blh getFileSystem$okhttp() {
        return this.d;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.D) {
                return;
            }
            if (this.d.exists(this.v)) {
                boolean zExists = this.d.exists(this.f);
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.d;
                cxz cxzVar = this.v;
                if (zExists) {
                    diskLruCache$fileSystem$1.delete(cxzVar);
                } else {
                    diskLruCache$fileSystem$1.atomicMove(cxzVar, this.f);
                }
            }
            this.C = _UtilCommonKt.isCivilized(this.d, this.v);
            if (this.d.exists(this.f)) {
                try {
                    l();
                    g();
                    this.D = true;
                    return;
                } catch (IOException e) {
                    Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        delete();
                        this.closed = false;
                        rebuildJournal$okhttp();
                        this.D = true;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.D = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final void l() throws Throwable {
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.d;
        cxz cxzVar = this.f;
        y740 y740VarB = z7b.b(diskLruCache$fileSystem$1.source(cxzVar));
        try {
            String strM = y740VarB.M(Long.MAX_VALUE);
            String strM2 = y740VarB.M(Long.MAX_VALUE);
            String strM3 = y740VarB.M(Long.MAX_VALUE);
            String strM4 = y740VarB.M(Long.MAX_VALUE);
            String strM5 = y740VarB.M(Long.MAX_VALUE);
            if (!Intrinsics.g(MAGIC, strM) || !Intrinsics.g(VERSION_1, strM2) || !Intrinsics.g(String.valueOf(this.b), strM3) || !Intrinsics.g(String.valueOf(this.valueCount), strM4) || strM5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM4 + ", " + strM5 + ']');
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    m(y740VarB.M(Long.MAX_VALUE));
                    i2++;
                } catch (EOFException unused) {
                    this.A = i2 - this.lruEntries.size();
                    if (y740VarB.N0()) {
                        bc5 bc5Var = this.y;
                        if (bc5Var != null) {
                            _UtilCommonKt.closeQuietly(bc5Var);
                        }
                        this.y = new x740(new FaultHidingSink(diskLruCache$fileSystem$1.appendingSink(cxzVar), new kre(this, i)));
                    } else {
                        rebuildJournal$okhttp();
                    }
                    Unit unit = Unit.a;
                    try {
                        y740VarB.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                y740VarB.close();
            } catch (Throwable th3) {
                rtg.a(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iS = StringsKt.S(str, ' ', 0, 6);
        if (iS == -1) {
            i08.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iS + 1;
        int iS2 = StringsKt.S(str, ' ', i, 4);
        LinkedHashMap<String, Entry> linkedHashMap = this.lruEntries;
        if (iS2 == -1) {
            strSubstring = str.substring(i);
            String str2 = REMOVE;
            if (iS == str2.length() && c.u(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iS2);
        }
        Entry entry = linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iS2 != -1) {
            String str3 = CLEAN;
            if (iS == str3.length() && c.u(str, str3, false)) {
                List<String> listF0 = StringsKt.f0(str.substring(iS2 + 1), new char[]{' '});
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listF0);
                return;
            }
        }
        if (iS2 == -1) {
            String str4 = DIRTY;
            if (iS == str4.length() && c.u(str, str4, false)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iS2 == -1) {
            String str5 = READ;
            if (iS == str5.length() && c.u(str, str5, false)) {
                return;
            }
        }
        i08.a("unexpected journal line: ".concat(str));
    }

    public final synchronized void rebuildJournal$okhttp() {
        Throwable th;
        try {
            bc5 bc5Var = this.y;
            if (bc5Var != null) {
                bc5Var.close();
            }
            int i = 0;
            x740 x740VarA = z7b.a(this.d.sink(this.i, false));
            try {
                x740VarA.R(MAGIC);
                x740VarA.writeByte(10);
                x740VarA.R(VERSION_1);
                x740VarA.writeByte(10);
                x740VarA.s0(this.b);
                x740VarA.writeByte(10);
                x740VarA.s0(this.valueCount);
                x740VarA.writeByte(10);
                x740VarA.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    entry.getClass();
                    Entry entry2 = entry;
                    if (entry2.getCurrentEditor() != null) {
                        x740VarA.R(DIRTY);
                        x740VarA.writeByte(32);
                        x740VarA.R(entry2.getKey());
                        x740VarA.writeByte(10);
                    } else {
                        x740VarA.R(CLEAN);
                        x740VarA.writeByte(32);
                        x740VarA.R(entry2.getKey());
                        entry2.writeLengths$okhttp(x740VarA);
                        x740VarA.writeByte(10);
                    }
                }
                Unit unit = Unit.a;
                try {
                    x740VarA.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    x740VarA.close();
                } catch (Throwable th4) {
                    rtg.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zExists = this.d.exists(this.f);
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.d;
            if (zExists) {
                diskLruCache$fileSystem$1.atomicMove(this.f, this.v);
                this.d.atomicMove(this.i, this.f);
                _UtilCommonKt.deleteIfExists(this.d, this.v);
            } else {
                diskLruCache$fileSystem$1.atomicMove(this.i, this.f);
            }
            bc5 bc5Var2 = this.y;
            if (bc5Var2 != null) {
                _UtilCommonKt.closeQuietly(bc5Var2);
            }
            this.y = new x740(new FaultHidingSink(this.d.appendingSink(this.f), new kre(this, i)));
            this.B = false;
            this.G = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean remove(String key) {
        key.getClass();
        initialize();
        d();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.w <= this.maxSize) {
            this.F = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        bc5 bc5Var;
        entry.getClass();
        if (!this.C) {
            if (entry.getLockingSourceCount() > 0 && (bc5Var = this.y) != null) {
                bc5Var.R(DIRTY);
                bc5Var.writeByte(32);
                bc5Var.R(entry.getKey());
                bc5Var.writeByte(10);
                bc5Var.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        for (int i = 0; i < this.valueCount; i++) {
            _UtilCommonKt.deleteIfExists(this.d, entry.getCleanFiles$okhttp().get(i));
            this.w -= entry.getLengths()[i];
            entry.getLengths()[i] = 0;
        }
        this.A++;
        bc5 bc5Var2 = this.y;
        if (bc5Var2 != null) {
            bc5Var2.R(REMOVE);
            bc5Var2.writeByte(32);
            bc5Var2.R(entry.getKey());
            bc5Var2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (f()) {
            TaskQueue.schedule$default(this.I, this.J, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.D) {
            TaskQueue.schedule$default(this.I, this.J, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.w;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() {
        while (this.w > this.maxSize) {
            for (Entry entry : this.lruEntries.values()) {
                entry.getClass();
                Entry entry2 = entry;
                if (!entry2.getZombie()) {
                    removeEntry$okhttp(entry2);
                }
            }
            return;
        }
        this.F = false;
    }

    public final Editor edit(String str) {
        str.getClass();
        return edit$default(this, str, 0L, 2, null);
    }
}
