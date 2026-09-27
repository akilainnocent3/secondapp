package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ByteString.c {
        ByteString.ByteIterator current = nextPiece();
        final c pieces;

        public a() {
            this.pieces = new c(a1.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
        private ByteString.ByteIterator nextPiece() {
            if (this.pieces.hasNext()) {
                return this.pieces.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.current;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements Iterator<ByteString.h> {
        private final ArrayDeque<a1> breadCrumbs;
        private ByteString.h next;

        public /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.h getLeafByLeft(ByteString root) {
            while (root instanceof a1) {
                a1 a1Var = (a1) root;
                this.breadCrumbs.push(a1Var);
                root = a1Var.left;
            }
            return (ByteString.h) root;
        }

        private ByteString.h getNextNonEmptyLeaf() {
            ByteString.h leafByLeft;
            do {
                ArrayDeque<a1> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(ByteString root) {
            if (!(root instanceof a1)) {
                this.breadCrumbs = null;
                this.next = (ByteString.h) root;
                return;
            }
            a1 a1Var = (a1) root;
            ArrayDeque<a1> arrayDeque = new ArrayDeque<>(a1Var.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(a1Var);
            this.next = getLeafByLeft(a1Var.left);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ByteString.h next() {
            ByteString.h hVar = this.next;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return hVar;
        }
    }

    public /* synthetic */ a1(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    public static ByteString concatenate(ByteString left, ByteString right) {
        if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }
        int size = left.size() + right.size();
        if (size < 128) {
            return concatenateBytes(left, right);
        }
        if (left instanceof a1) {
            a1 a1Var = (a1) left;
            if (a1Var.right.size() + right.size() < 128) {
                return new a1(a1Var.left, concatenateBytes(a1Var.right, right));
            }
            if (a1Var.left.getTreeDepth() > a1Var.right.getTreeDepth() && a1Var.getTreeDepth() > right.getTreeDepth()) {
                return new a1(a1Var.left, new a1(a1Var.right, right));
            }
        }
        return size >= minLength(Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1) ? new a1(left, right) : new b(null).balance(left, right);
    }

    private static ByteString concatenateBytes(ByteString left, ByteString right) {
        int size = left.size();
        int size2 = right.size();
        byte[] bArr = new byte[size + size2];
        left.copyTo(bArr, 0, 0, size);
        right.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        ByteString.h next;
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.h next2 = cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.h next3 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next2.size() - i10;
            int size2 = next3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next2.equalsRange(next3, i11, iMin) : next3.equalsRange(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.totalLength;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i11 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i11 += iMin;
            }
        }
    }

    public static int minLength(int depth) {
        int[] iArr = minLengthByDepth;
        if (depth >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[depth];
    }

    public static a1 newInstanceForTest(ByteString left, ByteString right) {
        return new a1(left, right);
    }

    private void readObject(ObjectInputStream in2) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int index) {
        ByteString.checkIndex(index, this.totalLength);
        return internalByteAt(index);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer target) {
        this.left.copyTo(target);
        this.right.copyTo(target);
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        int i10 = sourceOffset + numberToCopy;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            this.left.copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        } else {
            if (sourceOffset >= i11) {
                this.right.copyToInternal(target, sourceOffset - i11, targetOffset, numberToCopy);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.left.copyToInternal(target, sourceOffset, targetOffset, i12);
            this.right.copyToInternal(target, 0, targetOffset + i12, numberToCopy - i12);
        }
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) other;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int index) {
        int i10 = this.leftLength;
        return index < i10 ? this.left.internalByteAt(index) : this.right.internalByteAt(index - i10);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int h10, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            return this.left.partialHash(h10, offset, length);
        }
        if (offset >= i11) {
            return this.right.partialHash(h10, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.right.partialHash(this.left.partialHash(h10, offset, i12), 0, length - i12);
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int state, int offset, int length) {
        int i10 = offset + length;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            return this.left.partialIsValidUtf8(state, offset, length);
        }
        if (offset >= i11) {
            return this.right.partialIsValidUtf8(state, offset - i11, length);
        }
        int i12 = i11 - offset;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(state, offset, i12), 0, length - i12);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int beginIndex, int endIndex) {
        int iCheckRange = ByteString.checkRange(beginIndex, endIndex, this.totalLength);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i10 = this.leftLength;
        if (endIndex <= i10) {
            return this.left.substring(beginIndex, endIndex);
        }
        return beginIndex >= i10 ? this.right.substring(beginIndex - i10, endIndex - i10) : new a1(this.left.substring(beginIndex), this.right.substring(0, endIndex - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        int i10 = sourceOffset + numberToWrite;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            this.left.writeToInternal(out, sourceOffset, numberToWrite);
        } else {
            if (sourceOffset >= i11) {
                this.right.writeToInternal(out, sourceOffset - i11, numberToWrite);
                return;
            }
            int i12 = i11 - sourceOffset;
            this.left.writeToInternal(out, sourceOffset, i12);
            this.right.writeToInternal(out, 0, numberToWrite - i12);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(ByteOutput output) throws IOException {
        this.right.writeToReverse(output);
        this.left.writeToReverse(output);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        private final ArrayDeque<ByteString> prefixesStack;

        private b() {
            this.prefixesStack = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString balance(ByteString left, ByteString right) {
            doBalance(left);
            doBalance(right);
            ByteString byteStringPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                byteStringPop = new a1(this.prefixesStack.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        private void doBalance(ByteString root) {
            if (root.isBalanced()) {
                insert(root);
                return;
            }
            if (root instanceof a1) {
                a1 a1Var = (a1) root;
                doBalance(a1Var.left);
                doBalance(a1Var.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + root.getClass());
            }
        }

        private int getDepthBinForLength(int length) {
            int iBinarySearch = Arrays.binarySearch(a1.minLengthByDepth, length);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(ByteString byteString) {
            a aVar;
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int iMinLength = a1.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(byteString);
                return;
            }
            int iMinLength2 = a1.minLength(depthBinForLength);
            ByteString byteStringPop = this.prefixesStack.pop();
            while (true) {
                aVar = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    byteStringPop = new a1(this.prefixesStack.pop(), byteStringPop, aVar);
                }
            }
            a1 a1Var = new a1(byteStringPop, byteString, aVar);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= a1.minLength(getDepthBinForLength(a1Var.size()) + 1)) {
                    break;
                } else {
                    a1Var = new a1(this.prefixesStack.pop(), a1Var, aVar);
                }
            }
            this.prefixesStack.push(a1Var);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    private a1(ByteString left, ByteString right) {
        this.left = left;
        this.right = right;
        int size = left.size();
        this.leftLength = size;
        this.totalLength = size + right.size();
        this.treeDepth = Math.max(left.getTreeDepth(), right.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput output) throws IOException {
        this.left.writeTo(output);
        this.right.writeTo(output);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends InputStream {
        private ByteString.h currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private c pieceIterator;

        public d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i10 = this.currentPieceIndex;
                int i11 = this.currentPieceSize;
                if (i10 == i11) {
                    this.currentPieceOffsetInRope += i11;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        ByteString.h next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return a1.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            c cVar = new c(a1.this, null);
            this.pieceIterator = cVar;
            ByteString.h next = cVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] b10, int offset, int length) {
            int i10 = length;
            while (i10 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i10);
                if (b10 != null) {
                    this.currentPiece.copyTo(b10, this.currentPieceIndex, offset, iMin);
                    offset += iMin;
                }
                this.currentPieceIndex += iMin;
                i10 -= iMin;
            }
            return length - i10;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int readAheadLimit) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int offset, int length) {
            b10.getClass();
            if (offset < 0 || length < 0 || length > b10.length - offset) {
                throw new IndexOutOfBoundsException();
            }
            int skipInternal = readSkipInternal(b10, offset, length);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (length > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long length) {
            if (length < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (length > 2147483647L) {
                length = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            ByteString.h hVar = this.currentPiece;
            if (hVar == null) {
                return -1;
            }
            int i10 = this.currentPieceIndex;
            this.currentPieceIndex = i10 + 1;
            return hVar.byteAt(i10) & 255;
        }
    }
}
