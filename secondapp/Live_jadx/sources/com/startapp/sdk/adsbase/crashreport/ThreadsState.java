package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.startapp.sdk.internal.zh;
import gi.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import kj.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f74318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient boolean f74319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient boolean f74320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient HashSet f74321d;
    private final long delay;

    @Nullable
    private final String handlerDescription;

    @Nullable
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;

        @Nullable
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j10, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j10;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    public ThreadsState(zh zhVar) {
        this.f74318a = zhVar.f75991a;
        this.f74319b = zhVar.f75995e;
        this.f74320c = zhVar.f75996f;
        this.delay = zhVar.f75994d;
        this.handlerDescription = zhVar.f75992b;
        this.f74321d = zhVar.f75993c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + j.f86771d;
        int i10 = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i10));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] shrunkStackTraceElementArrB = b(value);
                if (shrunkStackTraceElementArrB != null && shrunkStackTraceElementArrB.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, shrunkStackTraceElementArrB);
                        i10 = 1;
                    } else if (!this.f74320c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + j.f86771d, shrunkStackTraceElementArrB);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i10 == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] shrunkStackTraceElementArrB2 = b(stackTrace);
            if (shrunkStackTraceElementArrB2 == null || shrunkStackTraceElementArrB2.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, shrunkStackTraceElementArrB2);
            }
        }
        this.threadsStackTraces = treeMap;
    }

    public final long a() {
        return this.delay;
    }

    public final String b() {
        return this.handlerDescription;
    }

    public final Map c() {
        return this.threadsStackTraces;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient String f74322a;

        private MainThreadComparator() {
            this.f74322a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f74322a)) {
                return -1;
            }
            if (str4.startsWith(this.f74322a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i10) {
            this();
        }
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f74321d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.f74321d.contains(className + e.f102543c + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        StackTraceElement stackTraceElement = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i10];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z12 = i10 < 3;
                String str = this.f74318a;
                boolean z13 = str == null || className.startsWith(str);
                if (z13) {
                    z10 = true;
                }
                if (!this.f74319b || z13 || z12 || z11) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j10, stackTraceElement));
                        j10 = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j10++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z11 = z13;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j10 + 1, null));
        }
        if (z10) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }
}
