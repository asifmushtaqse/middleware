package climesoft.net.request.body.multipart.part;

import climesoft.net.request.body.multipart.FileLikePart;

import static java.nio.charset.StandardCharsets.*;

public abstract class FileLikeMultipartPart<T extends FileLikePart> extends MultipartPart<T> {

  /**
   * Attachment's file name as a byte array
   */
  private static final byte[] FILE_NAME_BYTES = "; filename=".getBytes(US_ASCII);

  FileLikeMultipartPart(T part, byte[] boundary) {
    super(part, boundary);
  }

  protected void visitDispositionHeader(PartVisitor visitor) {
    super.visitDispositionHeader(visitor);
    if (part.getFileName() != null) {
      visitor.withBytes(FILE_NAME_BYTES);
      visitor.withByte(QUOTE_BYTE);
      visitor.withBytes(part.getFileName().getBytes(part.getCharset() != null ? part.getCharset() : UTF_8));
      visitor.withByte(QUOTE_BYTE);
    }
  }
}
