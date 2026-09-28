package defpackage;

import com.google.protobuf.Reader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class elh implements Sequence<File> {
    public final File a;
    public final FileWalkDirection b;
    public final Function1<File, Boolean> c;
    public final Function1<File, Unit> d;
    public final Function2<File, IOException, Unit> e;
    public final int f;

    public static abstract class a extends c {
    }

    public final class b extends k3<File> {
        public final ArrayDeque<c> c;

        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                file.getClass();
                this.f = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0057  */
            /* JADX WARN: Code duplicated, block: B:27:0x005a  */
            /* JADX WARN: Code duplicated, block: B:29:0x005e  */
            @Override // elh.c
            public final File a() {
                File[] fileArr;
                Function1<File, Unit> function1;
                elh elhVar = elh.this;
                boolean z = this.e;
                File file = this.a;
                if (z || this.c != null) {
                    fileArr = this.c;
                    if (fileArr == null && this.d < fileArr.length) {
                        fileArr.getClass();
                        int i = this.d;
                        this.d = i + 1;
                        return fileArr[i];
                    }
                    if (!this.b) {
                        this.b = true;
                        return file;
                    }
                    function1 = elhVar.d;
                    if (function1 != null) {
                        function1.invoke(file);
                    }
                } else {
                    Function1<File, Boolean> function2 = elhVar.c;
                    if (function2 == null || function2.invoke(file).booleanValue()) {
                        File[] fileArrListFiles = file.listFiles();
                        this.c = fileArrListFiles;
                        if (fileArrListFiles == null) {
                            Function2<File, IOException, Unit> function3 = elhVar.e;
                            if (function3 != null) {
                                File file2 = this.a;
                                function3.invoke(file2, new b6(file2, null, "Cannot list files in a directory", 2, null));
                            }
                            this.e = true;
                        }
                        fileArr = this.c;
                        if (fileArr == null) {
                        }
                        if (!this.b) {
                            this.b = true;
                            return file;
                        }
                        function1 = elhVar.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: elh$b$b, reason: collision with other inner class name */
        public final class C0526b extends c {
            public boolean b;

            @Override // elh.c
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                file.getClass();
                this.e = bVar;
            }

            @Override // elh.c
            public final File a() {
                Function2<File, IOException, Unit> function2;
                elh elhVar = elh.this;
                boolean z = this.b;
                File file = this.a;
                if (z) {
                    File[] fileArr = this.c;
                    if (fileArr == null || this.d < fileArr.length) {
                        if (fileArr == null) {
                            File[] fileArrListFiles = file.listFiles();
                            this.c = fileArrListFiles;
                            if (fileArrListFiles == null && (function2 = elhVar.e) != null) {
                                File file2 = this.a;
                                function2.invoke(file2, new b6(file2, null, "Cannot list files in a directory", 2, null));
                            }
                            fileArr = this.c;
                            if (fileArr == null || fileArr.length == 0) {
                                Function1<File, Unit> function1 = elhVar.d;
                                if (function1 != null) {
                                    function1.invoke(file);
                                }
                            }
                        }
                        fileArr.getClass();
                        int i = this.d;
                        this.d = i + 1;
                        return fileArr[i];
                    }
                    Function1<File, Unit> function3 = elhVar.d;
                    if (function3 != null) {
                        function3.invoke(file);
                        return null;
                    }
                } else {
                    Function1<File, Boolean> function4 = elhVar.c;
                    if (function4 == null || function4.invoke(file).booleanValue()) {
                        this.b = true;
                        return file;
                    }
                }
                return null;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            File file = elh.this.a;
            if (file.isDirectory()) {
                arrayDeque.push(c(file));
            } else if (!file.isFile()) {
                this.a = 2;
            } else {
                file.getClass();
                arrayDeque.push(new C0526b(file));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.k3
        public final void b() {
            T t;
            while (true) {
                ArrayDeque<c> arrayDeque = this.c;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t = 0;
                    break;
                }
                File fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else {
                    if (fileA.equals(cVarPeek.a) || !fileA.isDirectory() || arrayDeque.size() >= elh.this.f) {
                        t = fileA;
                        break;
                    }
                    arrayDeque.push(c(fileA));
                }
            }
            if (t == 0) {
                this.a = 2;
            } else {
                this.b = t;
                this.a = 1;
            }
        }

        public final a c(File file) {
            int iOrdinal = elh.this.b.ordinal();
            if (iOrdinal == 0) {
                return new c(this, file);
            }
            if (iOrdinal == 1) {
                return new a(this, file);
            }
            uhc.a();
            return null;
        }
    }

    public static abstract class c {
        public final File a;

        public c(File file) {
            file.getClass();
            this.a = file;
        }

        public abstract File a();
    }

    public /* synthetic */ elh(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.a : fileWalkDirection, function1, function2, function3, (i2 & 32) != 0 ? Reader.READ_DONE : i);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<File> iterator() {
        return new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public elh(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i) {
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = i;
    }
}
