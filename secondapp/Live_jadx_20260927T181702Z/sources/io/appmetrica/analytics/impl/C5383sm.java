package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5383sm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C5383sm[] f98324g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f98326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98330f;

    public C5383sm() {
        a();
    }

    public static C5383sm[] b() {
        if (f98324g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f98324g == null) {
                        f98324g = new C5383sm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f98324g;
    }

    public final C5383sm a() {
        this.f98325a = false;
        this.f98326b = false;
        this.f98327c = false;
        this.f98328d = false;
        this.f98329e = false;
        this.f98330f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f98328d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f98327c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f98326b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f98325a) + super.computeSerializedSize();
        boolean z10 = this.f98329e;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
        }
        int i10 = this.f98330f;
        return i10 != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i10) + iComputeBoolSize : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f98325a);
        codedOutputByteBufferNano.writeBool(2, this.f98326b);
        codedOutputByteBufferNano.writeBool(3, this.f98327c);
        codedOutputByteBufferNano.writeBool(4, this.f98328d);
        boolean z10 = this.f98329e;
        if (z10) {
            codedOutputByteBufferNano.writeBool(5, z10);
        }
        int i10 = this.f98330f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5383sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5383sm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5383sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f98325a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f98326b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f98327c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f98328d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f98329e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f98330f = int32;
                }
            }
        }
        return this;
    }

    public static C5383sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5383sm) MessageNano.mergeFrom(new C5383sm(), bArr);
    }
}
