package okhttp3.internal.http2;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.twilio.voice.VoiceURLConnection;
import defpackage.hce0;
import defpackage.i08;
import defpackage.lb5;
import defpackage.rl5;
import defpackage.xx0;
import defpackage.y740;
import defpackage.zmm;
import defpackage.zpa0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Lrl5;", "name", "checkLowercase", "(Lrl5;)Lrl5;", "", "Lokhttp3/internal/http2/Header;", "a", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "", "", "b", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "Reader", "Writer", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Hpack {
    public static final Hpack INSTANCE = new Hpack();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Header[] STATIC_HEADER_TABLE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Map<rl5, Integer> NAME_TO_FIRST_INDEX;

    static {
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        rl5 rl5Var = Header.TARGET_METHOD;
        Header header2 = new Header(rl5Var, "GET");
        Header header3 = new Header(rl5Var, VoiceURLConnection.METHOD_TYPE_POST);
        rl5 rl5Var2 = Header.TARGET_PATH;
        Header header4 = new Header(rl5Var2, "/");
        Header header5 = new Header(rl5Var2, "/index.html");
        rl5 rl5Var3 = Header.TARGET_SCHEME;
        Header header6 = new Header(rl5Var3, "http");
        Header header7 = new Header(rl5Var3, "https");
        rl5 rl5Var4 = Header.RESPONSE_STATUS;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(rl5Var4, "200"), new Header(rl5Var4, "204"), new Header(rl5Var4, "206"), new Header(rl5Var4, "304"), new Header(rl5Var4, "400"), new Header(rl5Var4, "404"), new Header(rl5Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(LastLoginDeviceInfo.KEY_LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        STATIC_HEADER_TABLE = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(headerArr[i].name, Integer.valueOf(i));
            }
        }
        Map<rl5, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        NAME_TO_FIRST_INDEX = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public final rl5 checkLowercase(rl5 name) throws IOException {
        name.getClass();
        int iD = name.d();
        for (int i = 0; i < iD; i++) {
            byte bJ = name.j(i);
            if (65 <= bJ && bJ < 91) {
                i08.a("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.s()));
                return null;
            }
        }
        return name;
    }

    public final Map<rl5, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006\""}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "headerTableSizeSetting", "", "useCompression", "Llb5;", "out", "<init>", "(IZLlb5;)V", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "", "writeHeaders", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "writeInt", "(III)V", "Lrl5;", "data", "writeByteString", "(Lrl5;)V", "resizeHeaderTable", "(I)V", "I", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Writer {
        public final boolean a;
        public final lb5 b;
        public int c;
        public boolean d;
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int e;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;

        public Writer(int i, boolean z, lb5 lb5Var) {
            lb5Var.getClass();
            this.headerTableSizeSetting = i;
            this.a = z;
            this.b = lb5Var;
            this.c = com.google.protobuf.Reader.READ_DONE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.e = headerArr.length - 1;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.dynamicTable.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    i -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    header2.getClass();
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i6 = this.e + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.e += i3;
            }
        }

        public final void b(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                Header[] headerArr = this.dynamicTable;
                xx0.l(0, headerArr.length, null, headerArr);
                this.e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            a((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr2 = this.dynamicTable;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.e = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr3;
                headerArr2 = headerArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            headerArr2[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, Http2.INITIAL_MAX_FRAME_SIZE);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.c = Math.min(this.c, iMin);
            }
            this.d = true;
            this.maxDynamicTableByteCount = iMin;
            int i2 = this.dynamicTableByteCount;
            if (iMin < i2) {
                if (iMin != 0) {
                    a(i2 - iMin);
                    return;
                }
                Header[] headerArr = this.dynamicTable;
                xx0.l(0, headerArr.length, null, headerArr);
                this.e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
            }
        }

        public final void writeByteString(rl5 data) throws EOFException {
            data.getClass();
            boolean z = this.a;
            lb5 lb5Var = this.b;
            if (z) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.d()) {
                    lb5 lb5Var2 = new lb5();
                    huffman.encode(data, lb5Var2);
                    rl5 rl5VarB0 = lb5Var2.B0(lb5Var2.b);
                    writeInt(rl5VarB0.d(), 127, 128);
                    lb5Var.c0(rl5VarB0);
                    return;
                }
            }
            writeInt(data.d(), 127, 0);
            lb5Var.c0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        public final void writeHeaders(List<Header> headerBlock) throws EOFException {
            int length;
            int length2;
            headerBlock.getClass();
            if (this.d) {
                int i = this.c;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, 31, 32);
                }
                this.d = false;
                this.c = com.google.protobuf.Reader.READ_DONE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = headerBlock.get(i2);
                rl5 rl5VarR = header.name.r();
                rl5 rl5Var = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(rl5VarR);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (Intrinsics.g(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, rl5Var)) {
                        length = length2;
                    } else if (Intrinsics.g(hpack.getSTATIC_HEADER_TABLE()[length2].value, rl5Var)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i3 = this.e + 1; i3 < length3; i3++) {
                        Header header2 = this.dynamicTable[i3];
                        header2.getClass();
                        if (Intrinsics.g(header2.name, rl5VarR)) {
                            Header header3 = this.dynamicTable[i3];
                            header3.getClass();
                            if (Intrinsics.g(header3.value, rl5Var)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i3 - this.e);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.e) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.b.d0(64);
                    writeByteString(rl5VarR);
                    writeByteString(rl5Var);
                    b(header);
                } else {
                    rl5 rl5Var2 = Header.PSEUDO_PREFIX;
                    rl5VarR.getClass();
                    rl5Var2.getClass();
                    if (!rl5VarR.n(0, rl5Var2, rl5Var2.d()) || Intrinsics.g(Header.TARGET_AUTHORITY, rl5VarR)) {
                        writeInt(length, 63, 64);
                        writeByteString(rl5Var);
                        b(header);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(rl5Var);
                    }
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            lb5 lb5Var = this.b;
            if (value < prefixMask) {
                lb5Var.d0(value | bits);
                return;
            }
            lb5Var.d0(bits | prefixMask);
            int i = value - prefixMask;
            while (i >= 128) {
                lb5Var.d0(128 | (i & 127));
                i >>>= 7;
            }
            lb5Var.d0(i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(lb5 lb5Var) {
            this(0, false, lb5Var, 3, null);
            lb5Var.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, lb5 lb5Var) {
            this(i, false, lb5Var, 2, null);
            lb5Var.getClass();
        }

        public /* synthetic */ Writer(int i, boolean z, lb5 lb5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, lb5Var);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lzpa0;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lzpa0;II)V", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "()Ljava/util/List;", "()I", "", "readHeaders", "()V", "firstByte", "prefixMask", "readInt", "(II)I", "Lrl5;", "readByteString", "()Lrl5;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "I", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reader {
        public final int a;
        public int b;
        public final ArrayList c;
        public final y740 d;
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int e;
        public int headerCount;

        public Reader(zpa0 zpa0Var, int i, int i2) {
            zpa0Var.getClass();
            this.a = i;
            this.b = i2;
            this.c = new ArrayList();
            this.d = new y740(zpa0Var);
            this.dynamicTable = new Header[8];
            this.e = 7;
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    header.getClass();
                    int i4 = header.hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.e += i3;
            }
            return i3;
        }

        public final rl5 b(int i) throws IOException {
            if (i >= 0) {
                Hpack hpack = Hpack.INSTANCE;
                if (i <= hpack.getSTATIC_HEADER_TABLE().length - 1) {
                    return hpack.getSTATIC_HEADER_TABLE()[i].name;
                }
            }
            int length = this.e + 1 + (i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (length >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (length < headerArr.length) {
                    Header header = headerArr[length];
                    header.getClass();
                    return header.name;
                }
            }
            zmm.a(i + 1, "Header index too large ");
            return null;
        }

        public final void c(Header header) {
            this.c.add(header);
            int i = header.hpackSize;
            int i2 = this.b;
            if (i > i2) {
                Header[] headerArr = this.dynamicTable;
                xx0.l(0, headerArr.length, null, headerArr);
                this.e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            a((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr2 = this.dynamicTable;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.e = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr3;
                headerArr2 = headerArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            headerArr2[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final List<Header> getAndResetHeaderList() {
            ArrayList arrayList = this.c;
            List<Header> listA0 = CollectionsKt.A0(arrayList);
            arrayList.clear();
            return listA0;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final rl5 readByteString() {
            y740 y740Var = this.d;
            int iAnd = _UtilCommonKt.and(y740Var.readByte(), 255);
            boolean z = (iAnd & 128) == 128;
            long j = readInt(iAnd, 127);
            if (!z) {
                return y740Var.B0(j);
            }
            lb5 lb5Var = new lb5();
            Huffman.INSTANCE.decode(y740Var, j, lb5Var);
            return lb5Var.B0(lb5Var.b);
        }

        public final void readHeaders() throws IOException {
            while (true) {
                y740 y740Var = this.d;
                if (y740Var.N0()) {
                    return;
                }
                int iAnd = _UtilCommonKt.and(y740Var.readByte(), 255);
                if (iAnd == 128) {
                    i08.a("index == 0");
                    return;
                }
                int i = iAnd & 128;
                ArrayList arrayList = this.c;
                if (i == 128) {
                    int i2 = readInt(iAnd, 127);
                    int i3 = i2 - 1;
                    if (i3 >= 0) {
                        Hpack hpack = Hpack.INSTANCE;
                        if (i3 <= hpack.getSTATIC_HEADER_TABLE().length - 1) {
                            arrayList.add(hpack.getSTATIC_HEADER_TABLE()[i3]);
                        }
                    }
                    int length = this.e + 1 + (i3 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                    if (length >= 0) {
                        Header[] headerArr = this.dynamicTable;
                        if (length < headerArr.length) {
                            Header header = headerArr[length];
                            header.getClass();
                            arrayList.add(header);
                        }
                    }
                    i08.a(hce0.a(i2, "Header index too large "));
                    return;
                }
                if (iAnd == 64) {
                    c(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                } else if ((iAnd & 64) == 64) {
                    c(new Header(b(readInt(iAnd, 63) - 1), readByteString()));
                } else if ((iAnd & 32) == 32) {
                    int i4 = readInt(iAnd, 31);
                    this.b = i4;
                    if (i4 < 0 || i4 > this.a) {
                        zmm.a(this.b, "Invalid dynamic table size update ");
                        return;
                    }
                    int i5 = this.dynamicTableByteCount;
                    if (i4 < i5) {
                        if (i4 == 0) {
                            Header[] headerArr2 = this.dynamicTable;
                            xx0.l(0, headerArr2.length, null, headerArr2);
                            this.e = this.dynamicTable.length - 1;
                            this.headerCount = 0;
                            this.dynamicTableByteCount = 0;
                        } else {
                            a(i5 - i4);
                        }
                    }
                } else if (iAnd == 16 || iAnd == 0) {
                    arrayList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                } else {
                    arrayList.add(new Header(b(readInt(iAnd, 15) - 1), readByteString()));
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int iAnd = _UtilCommonKt.and(this.d.readByte(), 255);
                if ((iAnd & 128) == 0) {
                    return prefixMask + (iAnd << i2);
                }
                prefixMask += (iAnd & 127) << i2;
                i2 += 7;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(zpa0 zpa0Var, int i) {
            this(zpa0Var, i, 0, 4, null);
            zpa0Var.getClass();
        }

        public /* synthetic */ Reader(zpa0 zpa0Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(zpa0Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}
