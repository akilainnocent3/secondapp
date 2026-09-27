package com.applovin.shadow.okio;

import androidx.media3.session.fe;
import fr.i0;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class Path implements Comparable<Path> {

    @oy.l
    public static final Companion Companion = new Companion(null);

    @oy.l
    @cs.g
    public static final String DIRECTORY_SEPARATOR;

    @oy.l
    private final ByteString bytes;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l File file) {
            m0.p(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l String str) {
            m0.p(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l java.nio.file.Path path) {
            m0.p(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l String str, boolean z10) {
            m0.p(str, "<this>");
            return com.applovin.shadow.okio.internal.Path.commonToPath(str, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l File file, boolean z10) {
            m0.p(file, "<this>");
            String string = file.toString();
            m0.o(string, "toString(...)");
            return get(string, z10);
        }

        @cs.k
        @cs.j(name = "get")
        @oy.l
        @cs.o
        public final Path get(@oy.l java.nio.file.Path path, boolean z10) {
            m0.p(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        m0.o(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(@oy.l ByteString bytes) {
        m0.p(bytes, "bytes");
        this.bytes = bytes;
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l File file) {
        return Companion.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    public boolean equals(@oy.m Object obj) {
        return (obj instanceof Path) && m0.g(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    @oy.l
    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    @oy.m
    public final Path getRoot() {
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    @oy.l
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @oy.l
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == getBytes$okio().size();
    }

    @cs.j(name = "name")
    @oy.l
    public final String name() {
        return nameBytes().utf8();
    }

    @cs.j(name = "nameBytes")
    @oy.l
    public final ByteString nameBytes() {
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null);
        }
        return (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    @oy.l
    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    @cs.j(name = androidx.constraintlayout.widget.g.W1)
    @oy.m
    public final Path parent() {
        if (m0.g(getBytes$okio(), com.applovin.shadow.okio.internal.Path.DOT) || m0.g(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH) || m0.g(getBytes$okio(), com.applovin.shadow.okio.internal.Path.BACKSLASH) || com.applovin.shadow.okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash == 2 && volumeLetter() != null) {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && getBytes$okio().startsWith(com.applovin.shadow.okio.internal.Path.BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || volumeLetter() == null) {
            if (indexOfLastSlash == -1) {
                return new Path(com.applovin.shadow.okio.internal.Path.DOT);
            }
            return indexOfLastSlash == 0 ? new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (getBytes$okio().size() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
    }

    @oy.l
    public final Path relativeTo(@oy.l Path other) {
        m0.p(other, "other");
        if (!m0.g(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && m0.g(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes$okio().size() == other.getBytes$okio().size()) {
            return Companion.get$default(Companion, fe.F, false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(com.applovin.shadow.okio.internal.Path.DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = com.applovin.shadow.okio.internal.Path.getSlash(other);
        if (slash == null && (slash = com.applovin.shadow.okio.internal.Path.getSlash(this)) == null) {
            slash = com.applovin.shadow.okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(com.applovin.shadow.okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return com.applovin.shadow.okio.internal.Path.toPath(buffer, false);
    }

    @cs.j(name = "resolve")
    @oy.l
    public final Path resolve(@oy.l Path child) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, false);
    }

    @oy.l
    public final File toFile() {
        return new File(toString());
    }

    @oy.l
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        m0.o(path, "get(...)");
        return path;
    }

    @oy.l
    public String toString() {
        return getBytes$okio().utf8();
    }

    @cs.j(name = "volumeLetter")
    @oy.m
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l File file, boolean z10) {
        return Companion.get(file, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(@oy.l Path other) {
        m0.p(other, "other");
        return getBytes$okio().compareTo(other.getBytes$okio());
    }

    @oy.l
    public final Path resolve(@oy.l Path child, boolean z10) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, z10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l String str) {
        return Companion.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    @cs.j(name = "resolve")
    @oy.l
    public final Path resolve(@oy.l String child) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l String str, boolean z10) {
        return Companion.get(str, z10);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l java.nio.file.Path path) {
        return Companion.get(path);
    }

    @cs.j(name = "resolve")
    @oy.l
    public final Path resolve(@oy.l ByteString child) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    @cs.k
    @cs.j(name = "get")
    @oy.l
    @cs.o
    public static final Path get(@oy.l java.nio.file.Path path, boolean z10) {
        return Companion.get(path, z10);
    }

    @oy.l
    public final Path resolve(@oy.l String child, boolean z10) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), z10);
    }

    @oy.l
    public final Path resolve(@oy.l ByteString child, boolean z10) {
        m0.p(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), z10);
    }
}
