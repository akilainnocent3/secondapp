package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class o extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95492c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95493d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o[] f95494e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f95495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f95496b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f95494e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f95494e == null) {
                        f95494e = new o[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95494e;
    }

    public final o a() {
        this.f95495a = false;
        this.f95496b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f95495a;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        n nVar = this.f95496b;
        return nVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, nVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f95495a;
        if (z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        n nVar = this.f95496b;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(2, nVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f95495a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f95496b == null) {
                    this.f95496b = new n();
                }
                codedInputByteBufferNano.readMessage(this.f95496b);
            }
        }
        return this;
    }

    public static o b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new o().mergeFrom(codedInputByteBufferNano);
    }

    public static o a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (o) MessageNano.mergeFrom(new o(), bArr);
    }
}
