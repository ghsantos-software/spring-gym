package spring.gym.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import spring.gym.database.model.AvaliacaoesFisicasEntity;
import spring.gym.dto.AlunoDto;
import spring.gym.exception.BadRequestException;
import spring.gym.exception.NotFoundException;
import spring.gym.service.AlunosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/alunos")
@RequiredArgsConstructor
@Validated
public class AlunosController {

    private final AlunosService alunosService;

    @PreAuthorize("#alunoId == authentication.principal.id")
    @GetMapping("/{alunoId}/avaliacao")
    public AvaliacaoesFisicasEntity getAvaliacaoFisica(@PathVariable Integer alunoId) throws NotFoundException {
        return alunosService.getAlunoAvalicacao(alunoId);
    }

    @DeleteMapping("/{alunoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerAluno(@PathVariable Integer alunoId) throws Exception {
        alunosService.deletarAluno(alunoId);
    }
}